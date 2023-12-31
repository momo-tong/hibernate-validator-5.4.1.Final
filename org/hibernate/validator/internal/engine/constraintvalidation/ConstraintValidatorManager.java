/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.engine.constraintvalidation;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.constraints.Null;
import javax.validation.metadata.ConstraintDescriptor;

import org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl;
import org.hibernate.validator.internal.util.Contracts;
import org.hibernate.validator.internal.util.TypeHelper;
import org.hibernate.validator.internal.util.logging.Log;
import org.hibernate.validator.internal.util.logging.LoggerFactory;

/**
 * Manager in charge of providing and caching initialized {@code ConstraintValidator} instances.
 *
 * @author Hardy Ferentschik
 */
public class ConstraintValidatorManager {
	private static final Log LOG = LoggerFactory.make();

	/**
	 * Dummy {@code ConstraintValidator} used as placeholder for the case that for a given context there exists
	 * no matching constraint validator instance
	 */
	private static ConstraintValidator<?, ?> DUMMY_CONSTRAINT_VALIDATOR = new ConstraintValidator<Null, Object>() {
		@Override
		public void initialize(Null constraintAnnotation) {
		}

		@Override
		public boolean isValid(Object value, ConstraintValidatorContext context) {
			return false;
		}
	};

	/**
	 * The explicit or implicit default constraint validator factory. We always cache {@code ConstraintValidator} instances
	 * if they are created via the default instance. Constraint validator instances created via other factory
	 * instances (specified eg via {@code ValidatorFactory#usingContext()} are only cached for the least recently used
	 * factory
	 */
	private final ConstraintValidatorFactory defaultConstraintValidatorFactory;

	/**
	 * The most recently used non default constraint validator factory.
	 */
	private ConstraintValidatorFactory mostRecentlyUsedNonDefaultConstraintValidatorFactory;

	/**
	 * Cache of initialized {@code ConstraintValidator} instances keyed against validates type, annotation and
	 * constraint validator factory ({@code CacheKey}).
	 */
	private final ConcurrentHashMap<CacheKey, ConstraintValidator<?, ?>> constraintValidatorCache;

	/**
	 * Creates a new {@code ConstraintValidatorManager}.
	 *
	 * @param constraintValidatorFactory the validator factory
	 */
	public ConstraintValidatorManager(ConstraintValidatorFactory constraintValidatorFactory) {
		this.defaultConstraintValidatorFactory = constraintValidatorFactory;
		this.constraintValidatorCache = new ConcurrentHashMap<CacheKey, ConstraintValidator<?, ?>>();
	}

	/**
	 * @param validatedValueType the type of the value to be validated. Cannot be {@code null}.
	 * @param descriptor the constraint descriptor for which to get an initialized constraint validator. Cannot be {@code null}
	 * @param constraintFactory constraint factory used to instantiate the constraint validator. Cannot be {@code null}.
	 * @param <V> the type of the value to be validated
	 * @param <A> the annotation type
	 *
	 * @return an initialized constraint validator for the given type and annotation of the value to be validated.
	 * {@code null} is returned if no matching constraint validator could be found.
	 */
	public <V, A extends Annotation> ConstraintValidator<A, V> getInitializedValidator(Type validatedValueType,
			ConstraintDescriptorImpl<A> descriptor,
			ConstraintValidatorFactory constraintFactory) {
		Contracts.assertNotNull( validatedValueType );
		Contracts.assertNotNull( descriptor );
		Contracts.assertNotNull( constraintFactory );

		CacheKey key = new CacheKey( descriptor.getAnnotation(), validatedValueType, constraintFactory );

		@SuppressWarnings("unchecked")
		ConstraintValidator<A, V> constraintValidator = (ConstraintValidator<A, V>) constraintValidatorCache.get(
				key
		);

		if ( constraintValidator == null ) {
			constraintValidator = createAndInitializeValidator( constraintFactory, validatedValueType, descriptor );
			constraintValidator = cacheValidator( key, constraintValidator );
		}
		else {
			LOG.tracef( "Constraint validator %s found in cache.", constraintValidator );
		}

		return DUMMY_CONSTRAINT_VALIDATOR == constraintValidator ? null : constraintValidator;
	}

	private <V, A extends Annotation> ConstraintValidator<A, V> cacheValidator(CacheKey key, ConstraintValidator<A, V> constraintValidator) {
		// we only cache constraint validator instances for the default and most recently used factory
		if ( key.constraintFactory != defaultConstraintValidatorFactory && key.constraintFactory != mostRecentlyUsedNonDefaultConstraintValidatorFactory ) {
			clearEntriesForFactory( mostRecentlyUsedNonDefaultConstraintValidatorFactory );
			mostRecentlyUsedNonDefaultConstraintValidatorFactory = key.constraintFactory;
		}

		@SuppressWarnings("unchecked")
		ConstraintValidator<A, V> cached = (ConstraintValidator<A, V>) constraintValidatorCache.putIfAbsent( key, constraintValidator );

		return cached != null ? cached : constraintValidator;
	}

	@SuppressWarnings("unchecked")
	private <V, A extends Annotation> ConstraintValidator<A, V> createAndInitializeValidator(
			ConstraintValidatorFactory constraintFactory,
			Type validatedValueType,
			ConstraintDescriptorImpl<A> descriptor) {

		Class<? extends ConstraintValidator<A, V>> validatorClass = (Class<? extends ConstraintValidator<A, V>>) findMatchingValidatorClass( descriptor, validatedValueType );
		ConstraintValidator<A, V> constraintValidator;

		if ( validatorClass == null ) {
			constraintValidator = (ConstraintValidator<A, V>) DUMMY_CONSTRAINT_VALIDATOR;
		}
		else {
			constraintValidator = constraintFactory.getInstance( validatorClass );

			if ( constraintValidator == null ) {
				throw LOG.getConstraintFactoryMustNotReturnNullException( validatorClass );
			}

			initializeValidator( descriptor, constraintValidator );
		}

		return constraintValidator;
	}

	private void clearEntriesForFactory(ConstraintValidatorFactory constraintFactory) {
		Iterator<Entry<CacheKey, ConstraintValidator<?, ?>>> cacheEntries = constraintValidatorCache.entrySet().iterator();

		while ( cacheEntries.hasNext() ) {
			Entry<CacheKey, ConstraintValidator<?, ?>> cacheEntry = cacheEntries.next();
			if ( cacheEntry.getKey().getConstraintFactory() == constraintFactory ) {
				constraintFactory.releaseInstance( cacheEntry.getValue() );
				cacheEntries.remove();
			}
		}
	}

	public void clear() {
		for ( Map.Entry<CacheKey, ConstraintValidator<?, ?>> entry : constraintValidatorCache.entrySet() ) {
			entry.getKey().getConstraintFactory().releaseInstance( entry.getValue() );
		}
		constraintValidatorCache.clear();
	}

	public ConstraintValidatorFactory getDefaultConstraintValidatorFactory() {
		return defaultConstraintValidatorFactory;
	}

	public int numberOfCachedConstraintValidatorInstances() {
		return constraintValidatorCache.size();
	}

	/**
	 * Runs the validator resolution algorithm.
	 *
	 * @param validatedValueType The type of the value to be validated (the type of the member/class the constraint was placed on).
	 *
	 * @return The class of a matching validator.
	 */
	private <A extends Annotation> Class<? extends ConstraintValidator<A, ?>> findMatchingValidatorClass(ConstraintDescriptorImpl<A> descriptor, Type validatedValueType) {
		Map<Type, Class<? extends ConstraintValidator<A, ?>>> availableValidatorTypes = TypeHelper.getValidatorsTypes(
				descriptor.getAnnotationType(),
				descriptor.getMatchingConstraintValidatorClasses()
		);

		List<Type> discoveredSuitableTypes = findSuitableValidatorTypes( validatedValueType, availableValidatorTypes );
		resolveAssignableTypes( discoveredSuitableTypes );

		if ( discoveredSuitableTypes.size() == 0 ) {
			return null;
		}

		if ( discoveredSuitableTypes.size() > 1 ) {
			throw LOG.getMoreThanOneValidatorFoundForTypeException( validatedValueType, discoveredSuitableTypes );
		}

		Type suitableType = discoveredSuitableTypes.get( 0 );
		return availableValidatorTypes.get( suitableType );
	}

	private <A extends Annotation> List<Type> findSuitableValidatorTypes(Type type, Map<Type, Class<? extends ConstraintValidator<A, ?>>> availableValidatorTypes) {
		List<Type> determinedSuitableTypes = newArrayList();
		for ( Type validatorType : availableValidatorTypes.keySet() ) {
			if ( TypeHelper.isAssignable( validatorType, type )
					&& !determinedSuitableTypes.contains( validatorType ) ) {
				determinedSuitableTypes.add( validatorType );
			}
		}
		return determinedSuitableTypes;
	}

	private <A extends Annotation> void initializeValidator(ConstraintDescriptor<A> descriptor, ConstraintValidator<A, ?> constraintValidator) {
		try {
			constraintValidator.initialize( descriptor.getAnnotation() );
		}
		catch (RuntimeException e) {
			throw LOG.getUnableToInitializeConstraintValidatorException( constraintValidator.getClass(), e );
		}
	}

	/**
	 * Tries to reduce all assignable classes down to a single class.
	 *
	 * @param assignableTypes The set of all classes which are assignable to the class of the value to be validated and
	 * which are handled by at least one of the  validators for the specified constraint.
	 */
	private void resolveAssignableTypes(List<Type> assignableTypes) {
		if ( assignableTypes.size() == 0 || assignableTypes.size() == 1 ) {
			return;
		}

		List<Type> typesToRemove = new ArrayList<Type>();
		do {
			typesToRemove.clear();
			Type type = assignableTypes.get( 0 );
			for ( int i = 1; i < assignableTypes.size(); i++ ) {
				if ( TypeHelper.isAssignable( type, assignableTypes.get( i ) ) ) {
					typesToRemove.add( type );
				}
				else if ( TypeHelper.isAssignable( assignableTypes.get( i ), type ) ) {
					typesToRemove.add( assignableTypes.get( i ) );
				}
			}
			assignableTypes.removeAll( typesToRemove );
		} while ( typesToRemove.size() > 0 );
	}

	private static final class CacheKey {
		private final Annotation annotation;
		private final Type validatedType;
		private final ConstraintValidatorFactory constraintFactory;
		private final int hashCode;

		private CacheKey(Annotation annotation, Type validatorType, ConstraintValidatorFactory constraintFactory) {
			this.annotation = annotation;
			this.validatedType = validatorType;
			this.constraintFactory = constraintFactory;
			this.hashCode = createHashCode();
		}

		public ConstraintValidatorFactory getConstraintFactory() {
			return constraintFactory;
		}

		@Override
		public boolean equals(Object o) {
			if ( this == o ) {
				return true;
			}
			if ( o == null || getClass() != o.getClass() ) {
				return false;
			}

			CacheKey cacheKey = (CacheKey) o;

			if ( annotation != null ? !annotation.equals( cacheKey.annotation ) : cacheKey.annotation != null ) {
				return false;
			}
			if ( constraintFactory != null ? !constraintFactory.equals( cacheKey.constraintFactory ) : cacheKey.constraintFactory != null ) {
				return false;
			}
			if ( validatedType != null ? !validatedType.equals( cacheKey.validatedType ) : cacheKey.validatedType != null ) {
				return false;
			}

			return true;
		}

		@Override
		public int hashCode() {
			return hashCode;
		}

		private int createHashCode() {
			int result = annotation != null ? annotation.hashCode() : 0;
			result = 31 * result + ( validatedType != null ? validatedType.hashCode() : 0 );
			result = 31 * result + ( constraintFactory != null ? constraintFactory.hashCode() : 0 );
			return result;
		}
	}
}
