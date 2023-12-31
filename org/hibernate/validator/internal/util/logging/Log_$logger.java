package org.hibernate.validator.internal.util.logging;

import java.util.Locale;
import javax.validation.ElementKind;
import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.validation.ConstraintTarget;
import javax.validation.ValidationException;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.lang.NoSuchMethodException;
import java.lang.RuntimeException;
import java.lang.reflect.TypeVariable;
import javax.validation.ConstraintDeclarationException;
import org.jboss.logging.BasicLogger;
import java.lang.ClassLoader;
import java.util.List;
import java.lang.reflect.Member;
import java.lang.IllegalArgumentException;
import java.util.regex.PatternSyntaxException;
import javax.validation.Path;
import java.lang.annotation.ElementType;
import javax.annotation.Generated;
import javax.validation.GroupDefinitionException;
import java.lang.reflect.Constructor;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import java.lang.NumberFormatException;
import java.lang.reflect.Method;
import java.lang.Exception;
import javax.validation.ConstraintDefinitionException;
import java.lang.reflect.Type;
import javax.xml.stream.XMLStreamException;
import java.lang.ClassCastException;
import java.util.Collection;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl.ConstraintType;
import java.util.Arrays;
import javax.validation.UnexpectedTypeException;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2017-03-16T17:15:38+0000")
public class Log_$logger extends DelegatingBasicLogger implements Log, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = Log_$logger.class.getName();
    public Log_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void version(final String version) {
        super.log.logf(FQCN, INFO, null, version$str(), version);
    }
    private static final String version = "HV000001: Hibernate Validator %s";
    protected String version$str() {
        return version;
    }
    @Override
    public final void ignoringXmlConfiguration() {
        super.log.logf(FQCN, INFO, null, ignoringXmlConfiguration$str());
    }
    private static final String ignoringXmlConfiguration = "HV000002: Ignoring XML configuration.";
    protected String ignoringXmlConfiguration$str() {
        return ignoringXmlConfiguration;
    }
    @Override
    public final void usingConstraintFactory(final Class<? extends javax.validation.ConstraintValidatorFactory> constraintFactoryClass) {
        super.log.logf(FQCN, INFO, null, usingConstraintFactory$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraintFactoryClass));
    }
    private static final String usingConstraintFactory = "HV000003: Using %s as constraint factory.";
    protected String usingConstraintFactory$str() {
        return usingConstraintFactory;
    }
    @Override
    public final void usingMessageInterpolator(final Class<? extends javax.validation.MessageInterpolator> messageInterpolatorClass) {
        super.log.logf(FQCN, INFO, null, usingMessageInterpolator$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(messageInterpolatorClass));
    }
    private static final String usingMessageInterpolator = "HV000004: Using %s as message interpolator.";
    protected String usingMessageInterpolator$str() {
        return usingMessageInterpolator;
    }
    @Override
    public final void usingTraversableResolver(final Class<? extends javax.validation.TraversableResolver> traversableResolverClass) {
        super.log.logf(FQCN, INFO, null, usingTraversableResolver$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(traversableResolverClass));
    }
    private static final String usingTraversableResolver = "HV000005: Using %s as traversable resolver.";
    protected String usingTraversableResolver$str() {
        return usingTraversableResolver;
    }
    @Override
    public final void usingValidationProvider(final Class<? extends javax.validation.spi.ValidationProvider<?>> validationProviderClass) {
        super.log.logf(FQCN, INFO, null, usingValidationProvider$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validationProviderClass));
    }
    private static final String usingValidationProvider = "HV000006: Using %s as validation provider.";
    protected String usingValidationProvider$str() {
        return usingValidationProvider;
    }
    @Override
    public final void parsingXMLFile(final String fileName) {
        super.log.logf(FQCN, INFO, null, parsingXMLFile$str(), fileName);
    }
    private static final String parsingXMLFile = "HV000007: %s found. Parsing XML based configuration.";
    protected String parsingXMLFile$str() {
        return parsingXMLFile;
    }
    @Override
    public final void unableToCloseInputStream() {
        super.log.logf(FQCN, WARN, null, unableToCloseInputStream$str());
    }
    private static final String unableToCloseInputStream = "HV000008: Unable to close input stream.";
    protected String unableToCloseInputStream$str() {
        return unableToCloseInputStream;
    }
    @Override
    public final void unableToCloseXMLFileInputStream(final String fileName) {
        super.log.logf(FQCN, WARN, null, unableToCloseXMLFileInputStream$str(), fileName);
    }
    private static final String unableToCloseXMLFileInputStream = "HV000010: Unable to close input stream for %s.";
    protected String unableToCloseXMLFileInputStream$str() {
        return unableToCloseXMLFileInputStream;
    }
    @Override
    public final void unableToCreateSchema(final String fileName, final String message) {
        super.log.logf(FQCN, WARN, null, unableToCreateSchema$str(), fileName, message);
    }
    private static final String unableToCreateSchema = "HV000011: Unable to create schema for %1$s: %2$s";
    protected String unableToCreateSchema$str() {
        return unableToCreateSchema;
    }
    private static final String getUnableToCreateAnnotationForConfiguredConstraintException = "HV000012: Unable to create annotation for configured constraint";
    protected String getUnableToCreateAnnotationForConfiguredConstraintException$str() {
        return getUnableToCreateAnnotationForConfiguredConstraintException;
    }
    @Override
    public final ValidationException getUnableToCreateAnnotationForConfiguredConstraintException(final RuntimeException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToCreateAnnotationForConfiguredConstraintException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToFindPropertyWithAccessException = "HV000013: The class %1$s does not have a property '%2$s' with access %3$s.";
    protected String getUnableToFindPropertyWithAccessException$str() {
        return getUnableToFindPropertyWithAccessException;
    }
    @Override
    public final ValidationException getUnableToFindPropertyWithAccessException(final Class<?> beanClass, final String property, final ElementType elementType) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToFindPropertyWithAccessException$str(), beanClass, property, elementType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidBigDecimalFormatException = "HV000016: %s does not represent a valid BigDecimal format.";
    protected String getInvalidBigDecimalFormatException$str() {
        return getInvalidBigDecimalFormatException;
    }
    @Override
    public final IllegalArgumentException getInvalidBigDecimalFormatException(final String value, final NumberFormatException e) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidBigDecimalFormatException$str(), value), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidLengthForIntegerPartException = "HV000017: The length of the integer part cannot be negative.";
    protected String getInvalidLengthForIntegerPartException$str() {
        return getInvalidLengthForIntegerPartException;
    }
    @Override
    public final IllegalArgumentException getInvalidLengthForIntegerPartException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidLengthForIntegerPartException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidLengthForFractionPartException = "HV000018: The length of the fraction part cannot be negative.";
    protected String getInvalidLengthForFractionPartException$str() {
        return getInvalidLengthForFractionPartException;
    }
    @Override
    public final IllegalArgumentException getInvalidLengthForFractionPartException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidLengthForFractionPartException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMinCannotBeNegativeException = "HV000019: The min parameter cannot be negative.";
    protected String getMinCannotBeNegativeException$str() {
        return getMinCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getMinCannotBeNegativeException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMinCannotBeNegativeException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMaxCannotBeNegativeException = "HV000020: The max parameter cannot be negative.";
    protected String getMaxCannotBeNegativeException$str() {
        return getMaxCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getMaxCannotBeNegativeException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMaxCannotBeNegativeException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getLengthCannotBeNegativeException = "HV000021: The length cannot be negative.";
    protected String getLengthCannotBeNegativeException$str() {
        return getLengthCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getLengthCannotBeNegativeException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getLengthCannotBeNegativeException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidRegularExpressionException = "HV000022: Invalid regular expression.";
    protected String getInvalidRegularExpressionException$str() {
        return getInvalidRegularExpressionException;
    }
    @Override
    public final IllegalArgumentException getInvalidRegularExpressionException(final PatternSyntaxException e) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidRegularExpressionException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getErrorDuringScriptExecutionException = "HV000023: Error during execution of script \"%s\" occurred.";
    protected String getErrorDuringScriptExecutionException$str() {
        return getErrorDuringScriptExecutionException;
    }
    @Override
    public final ConstraintDeclarationException getErrorDuringScriptExecutionException(final String script, final Exception e) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getErrorDuringScriptExecutionException$str(), script), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getScriptMustReturnTrueOrFalseException1 = "HV000024: Script \"%s\" returned null, but must return either true or false.";
    protected String getScriptMustReturnTrueOrFalseException1$str() {
        return getScriptMustReturnTrueOrFalseException1;
    }
    @Override
    public final ConstraintDeclarationException getScriptMustReturnTrueOrFalseException(final String script) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getScriptMustReturnTrueOrFalseException1$str(), script));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getScriptMustReturnTrueOrFalseException3 = "HV000025: Script \"%1$s\" returned %2$s (of type %3$s), but must return either true or false.";
    protected String getScriptMustReturnTrueOrFalseException3$str() {
        return getScriptMustReturnTrueOrFalseException3;
    }
    @Override
    public final ConstraintDeclarationException getScriptMustReturnTrueOrFalseException(final String script, final Object executionResult, final String type) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getScriptMustReturnTrueOrFalseException3$str(), script, executionResult, type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInconsistentConfigurationException = "HV000026: Assertion error: inconsistent ConfigurationImpl construction.";
    protected String getInconsistentConfigurationException$str() {
        return getInconsistentConfigurationException;
    }
    @Override
    public final ValidationException getInconsistentConfigurationException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInconsistentConfigurationException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToFindProviderException = "HV000027: Unable to find provider: %s.";
    protected String getUnableToFindProviderException$str() {
        return getUnableToFindProviderException;
    }
    @Override
    public final ValidationException getUnableToFindProviderException(final Class<?> providerClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToFindProviderException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(providerClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getExceptionDuringIsValidCallException = "HV000028: Unexpected exception during isValid call.";
    protected String getExceptionDuringIsValidCallException$str() {
        return getExceptionDuringIsValidCallException;
    }
    @Override
    public final ValidationException getExceptionDuringIsValidCallException(final RuntimeException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getExceptionDuringIsValidCallException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstraintFactoryMustNotReturnNullException = "HV000029: Constraint factory returned null when trying to create instance of %s.";
    protected String getConstraintFactoryMustNotReturnNullException$str() {
        return getConstraintFactoryMustNotReturnNullException;
    }
    @Override
    public final ValidationException getConstraintFactoryMustNotReturnNullException(final Class<? extends javax.validation.ConstraintValidator<?, ?>> validatorClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getConstraintFactoryMustNotReturnNullException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatorClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNoValidatorFoundForTypeException = "HV000030: No validator could be found for constraint '%s' validating type '%s'. Check configuration for '%s'";
    protected String getNoValidatorFoundForTypeException$str() {
        return getNoValidatorFoundForTypeException;
    }
    @Override
    public final UnexpectedTypeException getNoValidatorFoundForTypeException(final Class<? extends java.lang.annotation.Annotation> constraintType, final String validatedValueType, final String path) {
        final UnexpectedTypeException result = new UnexpectedTypeException(String.format(getLoggingLocale(), getNoValidatorFoundForTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraintType), validatedValueType, path));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMoreThanOneValidatorFoundForTypeException = "HV000031: There are multiple validator classes which could validate the type %1$s. The validator classes are: %2$s.";
    protected String getMoreThanOneValidatorFoundForTypeException$str() {
        return getMoreThanOneValidatorFoundForTypeException;
    }
    @Override
    public final UnexpectedTypeException getMoreThanOneValidatorFoundForTypeException(final Type type, final Collection<Type> validatorClasses) {
        final UnexpectedTypeException result = new UnexpectedTypeException(String.format(getLoggingLocale(), getMoreThanOneValidatorFoundForTypeException$str(), type, new org.hibernate.validator.internal.util.logging.formatter.CollectionOfObjectsToStringFormatter(validatorClasses)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInitializeConstraintValidatorException = "HV000032: Unable to initialize %s.";
    protected String getUnableToInitializeConstraintValidatorException$str() {
        return getUnableToInitializeConstraintValidatorException;
    }
    @Override
    public final ValidationException getUnableToInitializeConstraintValidatorException(final Class<? extends javax.validation.ConstraintValidator> validatorClass, final RuntimeException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInitializeConstraintValidatorException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatorClass)), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getAtLeastOneCustomMessageMustBeCreatedException = "HV000033: At least one custom message must be created if the default error message gets disabled.";
    protected String getAtLeastOneCustomMessageMustBeCreatedException$str() {
        return getAtLeastOneCustomMessageMustBeCreatedException;
    }
    @Override
    public final ValidationException getAtLeastOneCustomMessageMustBeCreatedException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getAtLeastOneCustomMessageMustBeCreatedException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidJavaIdentifierException = "HV000034: %s is not a valid Java Identifier.";
    protected String getInvalidJavaIdentifierException$str() {
        return getInvalidJavaIdentifierException;
    }
    @Override
    public final IllegalArgumentException getInvalidJavaIdentifierException(final String identifier) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidJavaIdentifierException$str(), identifier));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToParsePropertyPathException = "HV000035: Unable to parse property path %s.";
    protected String getUnableToParsePropertyPathException$str() {
        return getUnableToParsePropertyPathException;
    }
    @Override
    public final IllegalArgumentException getUnableToParsePropertyPathException(final String propertyPath) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getUnableToParsePropertyPathException$str(), propertyPath));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getTypeNotSupportedForUnwrappingException = "HV000036: Type %s not supported for unwrapping.";
    protected String getTypeNotSupportedForUnwrappingException$str() {
        return getTypeNotSupportedForUnwrappingException;
    }
    @Override
    public final ValidationException getTypeNotSupportedForUnwrappingException(final Class<?> type) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getTypeNotSupportedForUnwrappingException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(type)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInconsistentFailFastConfigurationException = "HV000037: Inconsistent fail fast configuration. Fail fast enabled via programmatic API, but explicitly disabled via properties.";
    protected String getInconsistentFailFastConfigurationException$str() {
        return getInconsistentFailFastConfigurationException;
    }
    @Override
    public final ValidationException getInconsistentFailFastConfigurationException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInconsistentFailFastConfigurationException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidPropertyPathException0 = "HV000038: Invalid property path.";
    protected String getInvalidPropertyPathException0$str() {
        return getInvalidPropertyPathException0;
    }
    @Override
    public final IllegalArgumentException getInvalidPropertyPathException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidPropertyPathException0$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidPropertyPathException2 = "HV000039: Invalid property path. Either there is no property %2$s in entity %1$s or it is not possible to cascade to the property.";
    protected String getInvalidPropertyPathException2$str() {
        return getInvalidPropertyPathException2;
    }
    @Override
    public final IllegalArgumentException getInvalidPropertyPathException(final Class<?> beanClass, final String propertyName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidPropertyPathException2$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), propertyName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getPropertyPathMustProvideIndexOrMapKeyException = "HV000040: Property path must provide index or map key.";
    protected String getPropertyPathMustProvideIndexOrMapKeyException$str() {
        return getPropertyPathMustProvideIndexOrMapKeyException;
    }
    @Override
    public final IllegalArgumentException getPropertyPathMustProvideIndexOrMapKeyException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getPropertyPathMustProvideIndexOrMapKeyException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getErrorDuringCallOfTraversableResolverIsReachableException = "HV000041: Call to TraversableResolver.isReachable() threw an exception.";
    protected String getErrorDuringCallOfTraversableResolverIsReachableException$str() {
        return getErrorDuringCallOfTraversableResolverIsReachableException;
    }
    @Override
    public final ValidationException getErrorDuringCallOfTraversableResolverIsReachableException(final RuntimeException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getErrorDuringCallOfTraversableResolverIsReachableException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getErrorDuringCallOfTraversableResolverIsCascadableException = "HV000042: Call to TraversableResolver.isCascadable() threw an exception.";
    protected String getErrorDuringCallOfTraversableResolverIsCascadableException$str() {
        return getErrorDuringCallOfTraversableResolverIsCascadableException;
    }
    @Override
    public final ValidationException getErrorDuringCallOfTraversableResolverIsCascadableException(final RuntimeException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getErrorDuringCallOfTraversableResolverIsCascadableException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToExpandDefaultGroupListException = "HV000043: Unable to expand default group list %1$s into sequence %2$s.";
    protected String getUnableToExpandDefaultGroupListException$str() {
        return getUnableToExpandDefaultGroupListException;
    }
    @Override
    public final GroupDefinitionException getUnableToExpandDefaultGroupListException(final List<?> defaultGroupList, final List<?> groupList) {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getUnableToExpandDefaultGroupListException$str(), new org.hibernate.validator.internal.util.logging.formatter.CollectionOfObjectsToStringFormatter(defaultGroupList), new org.hibernate.validator.internal.util.logging.formatter.CollectionOfObjectsToStringFormatter(groupList)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getAtLeastOneGroupHasToBeSpecifiedException = "HV000044: At least one group has to be specified.";
    protected String getAtLeastOneGroupHasToBeSpecifiedException$str() {
        return getAtLeastOneGroupHasToBeSpecifiedException;
    }
    @Override
    public final IllegalArgumentException getAtLeastOneGroupHasToBeSpecifiedException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getAtLeastOneGroupHasToBeSpecifiedException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getGroupHasToBeAnInterfaceException = "HV000045: A group has to be an interface. %s is not.";
    protected String getGroupHasToBeAnInterfaceException$str() {
        return getGroupHasToBeAnInterfaceException;
    }
    @Override
    public final ValidationException getGroupHasToBeAnInterfaceException(final Class<?> clazz) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getGroupHasToBeAnInterfaceException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(clazz)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getSequenceDefinitionsNotAllowedException = "HV000046: Sequence definitions are not allowed as composing parts of a sequence.";
    protected String getSequenceDefinitionsNotAllowedException$str() {
        return getSequenceDefinitionsNotAllowedException;
    }
    @Override
    public final GroupDefinitionException getSequenceDefinitionsNotAllowedException() {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getSequenceDefinitionsNotAllowedException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCyclicDependencyInGroupsDefinitionException = "HV000047: Cyclic dependency in groups definition";
    protected String getCyclicDependencyInGroupsDefinitionException$str() {
        return getCyclicDependencyInGroupsDefinitionException;
    }
    @Override
    public final GroupDefinitionException getCyclicDependencyInGroupsDefinitionException() {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getCyclicDependencyInGroupsDefinitionException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToExpandGroupSequenceException = "HV000048: Unable to expand group sequence.";
    protected String getUnableToExpandGroupSequenceException$str() {
        return getUnableToExpandGroupSequenceException;
    }
    @Override
    public final GroupDefinitionException getUnableToExpandGroupSequenceException() {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getUnableToExpandGroupSequenceException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidDefaultGroupSequenceDefinitionException = "HV000052: Default group sequence and default group sequence provider cannot be defined at the same time.";
    protected String getInvalidDefaultGroupSequenceDefinitionException$str() {
        return getInvalidDefaultGroupSequenceDefinitionException;
    }
    @Override
    public final GroupDefinitionException getInvalidDefaultGroupSequenceDefinitionException() {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getInvalidDefaultGroupSequenceDefinitionException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNoDefaultGroupInGroupSequenceException = "HV000053: 'Default.class' cannot appear in default group sequence list.";
    protected String getNoDefaultGroupInGroupSequenceException$str() {
        return getNoDefaultGroupInGroupSequenceException;
    }
    @Override
    public final GroupDefinitionException getNoDefaultGroupInGroupSequenceException() {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getNoDefaultGroupInGroupSequenceException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException = "HV000054: %s must be part of the redefined default group sequence.";
    protected String getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException$str() {
        return getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException;
    }
    @Override
    public final GroupDefinitionException getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException(final Class<?> beanClass) {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongDefaultGroupSequenceProviderTypeException = "HV000055: The default group sequence provider defined for %s has the wrong type";
    protected String getWrongDefaultGroupSequenceProviderTypeException$str() {
        return getWrongDefaultGroupSequenceProviderTypeException;
    }
    @Override
    public final GroupDefinitionException getWrongDefaultGroupSequenceProviderTypeException(final Class<?> beanClass) {
        final GroupDefinitionException result = new GroupDefinitionException(String.format(getLoggingLocale(), getWrongDefaultGroupSequenceProviderTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidExecutableParameterIndexException = "HV000056: Method or constructor %1$s doesn't have a parameter with index %2$d.";
    protected String getInvalidExecutableParameterIndexException$str() {
        return getInvalidExecutableParameterIndexException;
    }
    @Override
    public final IllegalArgumentException getInvalidExecutableParameterIndexException(final String executable, final int index) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidExecutableParameterIndexException$str(), executable, index));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToRetrieveAnnotationParameterValueException = "HV000059: Unable to retrieve annotation parameter value.";
    protected String getUnableToRetrieveAnnotationParameterValueException$str() {
        return getUnableToRetrieveAnnotationParameterValueException;
    }
    @Override
    public final ValidationException getUnableToRetrieveAnnotationParameterValueException(final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToRetrieveAnnotationParameterValueException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidLengthOfParameterMetaDataListException = "HV000062: Method or constructor %1$s has %2$s parameters, but the passed list of parameter meta data has a size of %3$s.";
    protected String getInvalidLengthOfParameterMetaDataListException$str() {
        return getInvalidLengthOfParameterMetaDataListException;
    }
    @Override
    public final IllegalArgumentException getInvalidLengthOfParameterMetaDataListException(final String executableName, final int nbParameters, final int listSize) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidLengthOfParameterMetaDataListException$str(), executableName, nbParameters, listSize));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateException1 = "HV000063: Unable to instantiate %s.";
    protected String getUnableToInstantiateException1$str() {
        return getUnableToInstantiateException1;
    }
    @Override
    public final ValidationException getUnableToInstantiateException(final Class<?> clazz, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateException1$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(clazz)), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateException2 = "HV000064: Unable to instantiate %1$s: %2$s.";
    protected String getUnableToInstantiateException2$str() {
        return getUnableToInstantiateException2;
    }
    @Override
    public final ValidationException getUnableToInstantiateException(final String message, final Class<?> clazz, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateException2$str(), message, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(clazz)), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToLoadClassException = "HV000065: Unable to load class: %s from %s.";
    protected String getUnableToLoadClassException$str() {
        return getUnableToLoadClassException;
    }
    @Override
    public final ValidationException getUnableToLoadClassException(final String className, final ClassLoader loader, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToLoadClassException$str(), className, loader), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getStartIndexCannotBeNegativeException = "HV000068: Start index cannot be negative: %d.";
    protected String getStartIndexCannotBeNegativeException$str() {
        return getStartIndexCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getStartIndexCannotBeNegativeException(final int startIndex) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getStartIndexCannotBeNegativeException$str(), startIndex));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getEndIndexCannotBeNegativeException = "HV000069: End index cannot be negative: %d.";
    protected String getEndIndexCannotBeNegativeException$str() {
        return getEndIndexCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getEndIndexCannotBeNegativeException(final int endIndex) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getEndIndexCannotBeNegativeException$str(), endIndex));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidRangeException = "HV000070: Invalid Range: %1$d > %2$d.";
    protected String getInvalidRangeException$str() {
        return getInvalidRangeException;
    }
    @Override
    public final IllegalArgumentException getInvalidRangeException(final int startIndex, final int endIndex) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidRangeException$str(), startIndex, endIndex));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidCheckDigitException = "HV000071: A explicitly specified check digit must lie outside the interval: [%1$d, %2$d].";
    protected String getInvalidCheckDigitException$str() {
        return getInvalidCheckDigitException;
    }
    @Override
    public final IllegalArgumentException getInvalidCheckDigitException(final int startIndex, final int endIndex) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidCheckDigitException$str(), startIndex, endIndex));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCharacterIsNotADigitException = "HV000072: '%c' is not a digit.";
    protected String getCharacterIsNotADigitException$str() {
        return getCharacterIsNotADigitException;
    }
    @Override
    public final NumberFormatException getCharacterIsNotADigitException(final char c) {
        final NumberFormatException result = new NumberFormatException(String.format(getLoggingLocale(), getCharacterIsNotADigitException$str(), c));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstraintParametersCannotStartWithValidException = "HV000073: Parameters starting with 'valid' are not allowed in a constraint.";
    protected String getConstraintParametersCannotStartWithValidException$str() {
        return getConstraintParametersCannotStartWithValidException;
    }
    @Override
    public final ConstraintDefinitionException getConstraintParametersCannotStartWithValidException() {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getConstraintParametersCannotStartWithValidException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstraintWithoutMandatoryParameterException = "HV000074: %2$s contains Constraint annotation, but does not contain a %1$s parameter.";
    protected String getConstraintWithoutMandatoryParameterException$str() {
        return getConstraintWithoutMandatoryParameterException;
    }
    @Override
    public final ConstraintDefinitionException getConstraintWithoutMandatoryParameterException(final String parameterName, final String constraintName) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getConstraintWithoutMandatoryParameterException$str(), parameterName, constraintName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongDefaultValueForPayloadParameterException = "HV000075: %s contains Constraint annotation, but the payload parameter default value is not the empty array.";
    protected String getWrongDefaultValueForPayloadParameterException$str() {
        return getWrongDefaultValueForPayloadParameterException;
    }
    @Override
    public final ConstraintDefinitionException getWrongDefaultValueForPayloadParameterException(final String constraintName) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongDefaultValueForPayloadParameterException$str(), constraintName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongTypeForPayloadParameterException = "HV000076: %s contains Constraint annotation, but the payload parameter is of wrong type.";
    protected String getWrongTypeForPayloadParameterException$str() {
        return getWrongTypeForPayloadParameterException;
    }
    @Override
    public final ConstraintDefinitionException getWrongTypeForPayloadParameterException(final String constraintName, final ClassCastException e) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongTypeForPayloadParameterException$str(), constraintName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongDefaultValueForGroupsParameterException = "HV000077: %s contains Constraint annotation, but the groups parameter default value is not the empty array.";
    protected String getWrongDefaultValueForGroupsParameterException$str() {
        return getWrongDefaultValueForGroupsParameterException;
    }
    @Override
    public final ConstraintDefinitionException getWrongDefaultValueForGroupsParameterException(final String constraintName) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongDefaultValueForGroupsParameterException$str(), constraintName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongTypeForGroupsParameterException = "HV000078: %s contains Constraint annotation, but the groups parameter is of wrong type.";
    protected String getWrongTypeForGroupsParameterException$str() {
        return getWrongTypeForGroupsParameterException;
    }
    @Override
    public final ConstraintDefinitionException getWrongTypeForGroupsParameterException(final String constraintName, final ClassCastException e) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongTypeForGroupsParameterException$str(), constraintName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongTypeForMessageParameterException = "HV000079: %s contains Constraint annotation, but the message parameter is not of type java.lang.String.";
    protected String getWrongTypeForMessageParameterException$str() {
        return getWrongTypeForMessageParameterException;
    }
    @Override
    public final ConstraintDefinitionException getWrongTypeForMessageParameterException(final String constraintName) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongTypeForMessageParameterException$str(), constraintName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getOverriddenConstraintAttributeNotFoundException = "HV000080: Overridden constraint does not define an attribute with name %s.";
    protected String getOverriddenConstraintAttributeNotFoundException$str() {
        return getOverriddenConstraintAttributeNotFoundException;
    }
    @Override
    public final ConstraintDefinitionException getOverriddenConstraintAttributeNotFoundException(final String attributeName) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getOverriddenConstraintAttributeNotFoundException$str(), attributeName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongAttributeTypeForOverriddenConstraintException = "HV000081: The overriding type of a composite constraint must be identical to the overridden one. Expected %1$s found %2$s.";
    protected String getWrongAttributeTypeForOverriddenConstraintException$str() {
        return getWrongAttributeTypeForOverriddenConstraintException;
    }
    @Override
    public final ConstraintDefinitionException getWrongAttributeTypeForOverriddenConstraintException(final Class<?> expectedReturnType, final Class<?> currentReturnType) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getWrongAttributeTypeForOverriddenConstraintException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(expectedReturnType), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(currentReturnType)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongParameterTypeException = "HV000082: Wrong parameter type. Expected: %1$s Actual: %2$s.";
    protected String getWrongParameterTypeException$str() {
        return getWrongParameterTypeException;
    }
    @Override
    public final ValidationException getWrongParameterTypeException(final Class<?> expectedType, final Class<?> currentType) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getWrongParameterTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(expectedType), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(currentType)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToFindAnnotationParameterException = "HV000083: The specified annotation defines no parameter '%s'.";
    protected String getUnableToFindAnnotationParameterException$str() {
        return getUnableToFindAnnotationParameterException;
    }
    @Override
    public final ValidationException getUnableToFindAnnotationParameterException(final String parameterName, final NoSuchMethodException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToFindAnnotationParameterException$str(), parameterName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToGetAnnotationParameterException = "HV000084: Unable to get '%1$s' from %2$s.";
    protected String getUnableToGetAnnotationParameterException$str() {
        return getUnableToGetAnnotationParameterException;
    }
    @Override
    public final ValidationException getUnableToGetAnnotationParameterException(final String parameterName, final Class<? extends java.lang.annotation.Annotation> annotationClass, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToGetAnnotationParameterException$str(), parameterName, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotationClass)), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNoValueProvidedForAnnotationParameterException = "HV000085: No value provided for parameter '%1$s' of annotation @%2$s.";
    protected String getNoValueProvidedForAnnotationParameterException$str() {
        return getNoValueProvidedForAnnotationParameterException;
    }
    @Override
    public final IllegalArgumentException getNoValueProvidedForAnnotationParameterException(final String parameterName, final Class<? extends java.lang.annotation.Annotation> annotation) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getNoValueProvidedForAnnotationParameterException$str(), parameterName, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotation)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getTryingToInstantiateAnnotationWithUnknownParametersException = "HV000086: Trying to instantiate %1$s with unknown parameter(s): %2$s.";
    protected String getTryingToInstantiateAnnotationWithUnknownParametersException$str() {
        return getTryingToInstantiateAnnotationWithUnknownParametersException;
    }
    @Override
    public final RuntimeException getTryingToInstantiateAnnotationWithUnknownParametersException(final Class<? extends java.lang.annotation.Annotation> annotationType, final Set<String> unknownParameters) {
        final RuntimeException result = new RuntimeException(String.format(getLoggingLocale(), getTryingToInstantiateAnnotationWithUnknownParametersException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotationType), unknownParameters));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getPropertyNameCannotBeNullOrEmptyException = "HV000087: Property name cannot be null or empty.";
    protected String getPropertyNameCannotBeNullOrEmptyException$str() {
        return getPropertyNameCannotBeNullOrEmptyException;
    }
    @Override
    public final IllegalArgumentException getPropertyNameCannotBeNullOrEmptyException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getPropertyNameCannotBeNullOrEmptyException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getElementTypeHasToBeFieldOrMethodException = "HV000088: Element type has to be FIELD or METHOD.";
    protected String getElementTypeHasToBeFieldOrMethodException$str() {
        return getElementTypeHasToBeFieldOrMethodException;
    }
    @Override
    public final IllegalArgumentException getElementTypeHasToBeFieldOrMethodException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getElementTypeHasToBeFieldOrMethodException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMemberIsNeitherAFieldNorAMethodException = "HV000089: Member %s is neither a field nor a method.";
    protected String getMemberIsNeitherAFieldNorAMethodException$str() {
        return getMemberIsNeitherAFieldNorAMethodException;
    }
    @Override
    public final IllegalArgumentException getMemberIsNeitherAFieldNorAMethodException(final Member member) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMemberIsNeitherAFieldNorAMethodException$str(), member));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToAccessMemberException = "HV000090: Unable to access %s.";
    protected String getUnableToAccessMemberException$str() {
        return getUnableToAccessMemberException;
    }
    @Override
    public final ValidationException getUnableToAccessMemberException(final String memberName, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToAccessMemberException$str(), memberName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getHasToBeAPrimitiveTypeException = "HV000091: %s has to be a primitive type.";
    protected String getHasToBeAPrimitiveTypeException$str() {
        return getHasToBeAPrimitiveTypeException;
    }
    @Override
    public final IllegalArgumentException getHasToBeAPrimitiveTypeException(final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getHasToBeAPrimitiveTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(clazz)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNullIsAnInvalidTypeForAConstraintValidatorException = "HV000093: null is an invalid type for a constraint validator.";
    protected String getNullIsAnInvalidTypeForAConstraintValidatorException$str() {
        return getNullIsAnInvalidTypeForAConstraintValidatorException;
    }
    @Override
    public final ValidationException getNullIsAnInvalidTypeForAConstraintValidatorException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getNullIsAnInvalidTypeForAConstraintValidatorException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMissingActualTypeArgumentForTypeParameterException = "HV000094: Missing actual type argument for type parameter: %s.";
    protected String getMissingActualTypeArgumentForTypeParameterException$str() {
        return getMissingActualTypeArgumentForTypeParameterException;
    }
    @Override
    public final IllegalArgumentException getMissingActualTypeArgumentForTypeParameterException(final TypeVariable<?> typeParameter) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMissingActualTypeArgumentForTypeParameterException$str(), typeParameter));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateConstraintFactoryClassException = "HV000095: Unable to instantiate constraint factory class %s.";
    protected String getUnableToInstantiateConstraintFactoryClassException$str() {
        return getUnableToInstantiateConstraintFactoryClassException;
    }
    @Override
    public final ValidationException getUnableToInstantiateConstraintFactoryClassException(final String constraintFactoryClassName, final ValidationException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateConstraintFactoryClassException$str(), constraintFactoryClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToOpenInputStreamForMappingFileException = "HV000096: Unable to open input stream for mapping file %s.";
    protected String getUnableToOpenInputStreamForMappingFileException$str() {
        return getUnableToOpenInputStreamForMappingFileException;
    }
    @Override
    public final ValidationException getUnableToOpenInputStreamForMappingFileException(final String mappingFileName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToOpenInputStreamForMappingFileException$str(), mappingFileName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateMessageInterpolatorClassException = "HV000097: Unable to instantiate message interpolator class %s.";
    protected String getUnableToInstantiateMessageInterpolatorClassException$str() {
        return getUnableToInstantiateMessageInterpolatorClassException;
    }
    @Override
    public final ValidationException getUnableToInstantiateMessageInterpolatorClassException(final String messageInterpolatorClassName, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateMessageInterpolatorClassException$str(), messageInterpolatorClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateTraversableResolverClassException = "HV000098: Unable to instantiate traversable resolver class %s.";
    protected String getUnableToInstantiateTraversableResolverClassException$str() {
        return getUnableToInstantiateTraversableResolverClassException;
    }
    @Override
    public final ValidationException getUnableToInstantiateTraversableResolverClassException(final String traversableResolverClassName, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateTraversableResolverClassException$str(), traversableResolverClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInstantiateValidationProviderClassException = "HV000099: Unable to instantiate validation provider class %s.";
    protected String getUnableToInstantiateValidationProviderClassException$str() {
        return getUnableToInstantiateValidationProviderClassException;
    }
    @Override
    public final ValidationException getUnableToInstantiateValidationProviderClassException(final String providerClassName, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateValidationProviderClassException$str(), providerClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToParseValidationXmlFileException = "HV000100: Unable to parse %s.";
    protected String getUnableToParseValidationXmlFileException$str() {
        return getUnableToParseValidationXmlFileException;
    }
    @Override
    public final ValidationException getUnableToParseValidationXmlFileException(final String file, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToParseValidationXmlFileException$str(), file), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getIsNotAnAnnotationException = "HV000101: %s is not an annotation.";
    protected String getIsNotAnAnnotationException$str() {
        return getIsNotAnAnnotationException;
    }
    @Override
    public final ValidationException getIsNotAnAnnotationException(final Class<?> annotationClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getIsNotAnAnnotationException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotationClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getIsNotAConstraintValidatorClassException = "HV000102: %s is not a constraint validator class.";
    protected String getIsNotAConstraintValidatorClassException$str() {
        return getIsNotAConstraintValidatorClassException;
    }
    @Override
    public final ValidationException getIsNotAConstraintValidatorClassException(final Class<?> validatorClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getIsNotAConstraintValidatorClassException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatorClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanClassHasAlreadyBeConfiguredInXmlException = "HV000103: %s is configured at least twice in xml.";
    protected String getBeanClassHasAlreadyBeConfiguredInXmlException$str() {
        return getBeanClassHasAlreadyBeConfiguredInXmlException;
    }
    @Override
    public final ValidationException getBeanClassHasAlreadyBeConfiguredInXmlException(final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanClassHasAlreadyBeConfiguredInXmlException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getIsDefinedTwiceInMappingXmlForBeanException = "HV000104: %1$s is defined twice in mapping xml for bean %2$s.";
    protected String getIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getIsDefinedTwiceInMappingXmlForBeanException;
    }
    @Override
    public final ValidationException getIsDefinedTwiceInMappingXmlForBeanException(final String name, final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getIsDefinedTwiceInMappingXmlForBeanException$str(), name, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanDoesNotContainTheFieldException = "HV000105: %1$s does not contain the fieldType %2$s.";
    protected String getBeanDoesNotContainTheFieldException$str() {
        return getBeanDoesNotContainTheFieldException;
    }
    @Override
    public final ValidationException getBeanDoesNotContainTheFieldException(final Class<?> beanClass, final String fieldName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanDoesNotContainTheFieldException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), fieldName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanDoesNotContainThePropertyException = "HV000106: %1$s does not contain the property %2$s.";
    protected String getBeanDoesNotContainThePropertyException$str() {
        return getBeanDoesNotContainThePropertyException;
    }
    @Override
    public final ValidationException getBeanDoesNotContainThePropertyException(final Class<?> beanClass, final String getterName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanDoesNotContainThePropertyException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), getterName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getAnnotationDoesNotContainAParameterException = "HV000107: Annotation of type %1$s does not contain a parameter %2$s.";
    protected String getAnnotationDoesNotContainAParameterException$str() {
        return getAnnotationDoesNotContainAParameterException;
    }
    @Override
    public final ValidationException getAnnotationDoesNotContainAParameterException(final Class<? extends java.lang.annotation.Annotation> annotationClass, final String parameterName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getAnnotationDoesNotContainAParameterException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotationClass), parameterName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException = "HV000108: Attempt to specify an array where single value is expected.";
    protected String getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException$str() {
        return getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException;
    }
    @Override
    public final ValidationException getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnexpectedParameterValueException = "HV000109: Unexpected parameter value.";
    protected String getUnexpectedParameterValueException$str() {
        return getUnexpectedParameterValueException;
    }
    @Override
    public final ValidationException getUnexpectedParameterValueException() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnexpectedParameterValueException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final ValidationException getUnexpectedParameterValueException(final ClassCastException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnexpectedParameterValueException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidNumberFormatException = "HV000110: Invalid %s format.";
    protected String getInvalidNumberFormatException$str() {
        return getInvalidNumberFormatException;
    }
    @Override
    public final ValidationException getInvalidNumberFormatException(final String formatName, final NumberFormatException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInvalidNumberFormatException$str(), formatName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidCharValueException = "HV000111: Invalid char value: %s.";
    protected String getInvalidCharValueException$str() {
        return getInvalidCharValueException;
    }
    @Override
    public final ValidationException getInvalidCharValueException(final String value) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInvalidCharValueException$str(), value));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidReturnTypeException = "HV000112: Invalid return type: %s. Should be a enumeration type.";
    protected String getInvalidReturnTypeException$str() {
        return getInvalidReturnTypeException;
    }
    @Override
    public final ValidationException getInvalidReturnTypeException(final Class<?> returnType, final ClassCastException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInvalidReturnTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(returnType)), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getReservedParameterNamesException = "HV000113: %s, %s, %s are reserved parameter names.";
    protected String getReservedParameterNamesException$str() {
        return getReservedParameterNamesException;
    }
    @Override
    public final ValidationException getReservedParameterNamesException(final String messageParameterName, final String groupsParameterName, final String payloadParameterName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getReservedParameterNamesException$str(), messageParameterName, groupsParameterName, payloadParameterName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWrongPayloadClassException = "HV000114: Specified payload class %s does not implement javax.validation.Payload";
    protected String getWrongPayloadClassException$str() {
        return getWrongPayloadClassException;
    }
    @Override
    public final ValidationException getWrongPayloadClassException(final Class<?> payloadClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getWrongPayloadClassException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(payloadClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getErrorParsingMappingFileException = "HV000115: Error parsing mapping file.";
    protected String getErrorParsingMappingFileException$str() {
        return getErrorParsingMappingFileException;
    }
    @Override
    public final ValidationException getErrorParsingMappingFileException(final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getErrorParsingMappingFileException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getIllegalArgumentException = "HV000116: %s";
    protected String getIllegalArgumentException$str() {
        return getIllegalArgumentException;
    }
    @Override
    public final IllegalArgumentException getIllegalArgumentException(final String message) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getIllegalArgumentException$str(), message));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToNarrowNodeTypeException = "HV000118: Unable to cast %s (with element kind %s) to %s";
    protected String getUnableToNarrowNodeTypeException$str() {
        return getUnableToNarrowNodeTypeException;
    }
    @Override
    public final ClassCastException getUnableToNarrowNodeTypeException(final Class<?> actualDescriptorType, final ElementKind kind, final Class<?> expectedDescriptorType) {
        final ClassCastException result = new ClassCastException(String.format(getLoggingLocale(), getUnableToNarrowNodeTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(actualDescriptorType), kind, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(expectedDescriptorType)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void usingParameterNameProvider(final Class<? extends javax.validation.ParameterNameProvider> parameterNameProviderClass) {
        super.log.logf(FQCN, INFO, null, usingParameterNameProvider$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(parameterNameProviderClass));
    }
    private static final String usingParameterNameProvider = "HV000119: Using %s as parameter name provider.";
    protected String usingParameterNameProvider$str() {
        return usingParameterNameProvider;
    }
    private static final String getUnableToInstantiateParameterNameProviderClassException = "HV000120: Unable to instantiate parameter name provider class %s.";
    protected String getUnableToInstantiateParameterNameProviderClassException$str() {
        return getUnableToInstantiateParameterNameProviderClassException;
    }
    @Override
    public final ValidationException getUnableToInstantiateParameterNameProviderClassException(final String parameterNameProviderClassName, final ValidationException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInstantiateParameterNameProviderClassException$str(), parameterNameProviderClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToDetermineSchemaVersionException = "HV000121: Unable to parse %s.";
    protected String getUnableToDetermineSchemaVersionException$str() {
        return getUnableToDetermineSchemaVersionException;
    }
    @Override
    public final ValidationException getUnableToDetermineSchemaVersionException(final String file, final XMLStreamException e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToDetermineSchemaVersionException$str(), file), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnsupportedSchemaVersionException = "HV000122: Unsupported schema version for %s: %s.";
    protected String getUnsupportedSchemaVersionException$str() {
        return getUnsupportedSchemaVersionException;
    }
    @Override
    public final ValidationException getUnsupportedSchemaVersionException(final String file, final String version) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnsupportedSchemaVersionException$str(), file, version));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMultipleGroupConversionsForSameSourceException = "HV000124: Found multiple group conversions for source group %s: %s.";
    protected String getMultipleGroupConversionsForSameSourceException$str() {
        return getMultipleGroupConversionsForSameSourceException;
    }
    @Override
    public final ConstraintDeclarationException getMultipleGroupConversionsForSameSourceException(final Class<?> from, final Set<Class<?>> tos) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getMultipleGroupConversionsForSameSourceException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(from), new org.hibernate.validator.internal.util.logging.formatter.CollectionOfClassesObjectFormatter(tos)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getGroupConversionOnNonCascadingElementException = "HV000125: Found group conversions for non-cascading element: %s.";
    protected String getGroupConversionOnNonCascadingElementException$str() {
        return getGroupConversionOnNonCascadingElementException;
    }
    @Override
    public final ConstraintDeclarationException getGroupConversionOnNonCascadingElementException(final String location) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getGroupConversionOnNonCascadingElementException$str(), location));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getGroupConversionForSequenceException = "HV000127: Found group conversion using a group sequence as source: %s.";
    protected String getGroupConversionForSequenceException$str() {
        return getGroupConversionForSequenceException;
    }
    @Override
    public final ConstraintDeclarationException getGroupConversionForSequenceException(final Class<?> from) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getGroupConversionForSequenceException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(from)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void unknownPropertyInExpressionLanguage(final String expression, final Exception e) {
        super.log.logf(FQCN, WARN, e, unknownPropertyInExpressionLanguage$str(), expression);
    }
    private static final String unknownPropertyInExpressionLanguage = "HV000129: EL expression '%s' references an unknown property";
    protected String unknownPropertyInExpressionLanguage$str() {
        return unknownPropertyInExpressionLanguage;
    }
    @Override
    public final void errorInExpressionLanguage(final String expression, final Exception e) {
        super.log.logf(FQCN, WARN, e, errorInExpressionLanguage$str(), expression);
    }
    private static final String errorInExpressionLanguage = "HV000130: Error in EL expression '%s'";
    protected String errorInExpressionLanguage$str() {
        return errorInExpressionLanguage;
    }
    private static final String getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException = "HV000131: A method return value must not be marked for cascaded validation more than once in a class hierarchy, but the following two methods are marked as such: %s, %s.";
    protected String getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException$str() {
        return getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException;
    }
    @Override
    public final ConstraintDeclarationException getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException(final Member member1, final Member member2) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException$str(), member1, member2));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getVoidMethodsMustNotBeConstrainedException = "HV000132: Void methods must not be constrained or marked for cascaded validation, but method %s is.";
    protected String getVoidMethodsMustNotBeConstrainedException$str() {
        return getVoidMethodsMustNotBeConstrainedException;
    }
    @Override
    public final ConstraintDeclarationException getVoidMethodsMustNotBeConstrainedException(final Member member) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getVoidMethodsMustNotBeConstrainedException$str(), member));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanDoesNotContainConstructorException = "HV000133: %1$s does not contain a constructor with the parameter types %2$s.";
    protected String getBeanDoesNotContainConstructorException$str() {
        return getBeanDoesNotContainConstructorException;
    }
    @Override
    public final ValidationException getBeanDoesNotContainConstructorException(final Class<?> beanClass, final List<Class<?>> parameterTypes) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanDoesNotContainConstructorException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), new org.hibernate.validator.internal.util.logging.formatter.CollectionOfClassesObjectFormatter(parameterTypes)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidParameterTypeException = "HV000134: Unable to load parameter of type '%1$s' in %2$s.";
    protected String getInvalidParameterTypeException$str() {
        return getInvalidParameterTypeException;
    }
    @Override
    public final ValidationException getInvalidParameterTypeException(final String type, final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getInvalidParameterTypeException$str(), type, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanDoesNotContainMethodException = "HV000135: %1$s does not contain a method with the name '%2$s' and parameter types %3$s.";
    protected String getBeanDoesNotContainMethodException$str() {
        return getBeanDoesNotContainMethodException;
    }
    @Override
    public final ValidationException getBeanDoesNotContainMethodException(final Class<?> beanClass, final String methodName, final List<Class<?>> parameterTypes) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanDoesNotContainMethodException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), methodName, new org.hibernate.validator.internal.util.logging.formatter.CollectionOfClassesObjectFormatter(parameterTypes)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToLoadConstraintAnnotationClassException = "HV000136: The specified constraint annotation class %1$s cannot be loaded.";
    protected String getUnableToLoadConstraintAnnotationClassException$str() {
        return getUnableToLoadConstraintAnnotationClassException;
    }
    @Override
    public final ValidationException getUnableToLoadConstraintAnnotationClassException(final String constraintAnnotationClassName, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToLoadConstraintAnnotationClassException$str(), constraintAnnotationClassName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMethodIsDefinedTwiceInMappingXmlForBeanException = "HV000137: The method '%1$s' is defined twice in the mapping xml for bean %2$s.";
    protected String getMethodIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getMethodIsDefinedTwiceInMappingXmlForBeanException;
    }
    @Override
    public final ValidationException getMethodIsDefinedTwiceInMappingXmlForBeanException(final Method name, final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getMethodIsDefinedTwiceInMappingXmlForBeanException$str(), name, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstructorIsDefinedTwiceInMappingXmlForBeanException = "HV000138: The constructor '%1$s' is defined twice in the mapping xml for bean %2$s.";
    protected String getConstructorIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getConstructorIsDefinedTwiceInMappingXmlForBeanException;
    }
    @Override
    public final ValidationException getConstructorIsDefinedTwiceInMappingXmlForBeanException(final Constructor<?> name, final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getConstructorIsDefinedTwiceInMappingXmlForBeanException$str(), name, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMultipleCrossParameterValidatorClassesException = "HV000139: The constraint '%1$s' defines multiple cross parameter validators. Only one is allowed.";
    protected String getMultipleCrossParameterValidatorClassesException$str() {
        return getMultipleCrossParameterValidatorClassesException;
    }
    @Override
    public final ConstraintDefinitionException getMultipleCrossParameterValidatorClassesException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getMultipleCrossParameterValidatorClassesException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getImplicitConstraintTargetInAmbiguousConfigurationException = "HV000141: The constraint %1$s used ConstraintTarget#IMPLICIT where the target cannot be inferred.";
    protected String getImplicitConstraintTargetInAmbiguousConfigurationException$str() {
        return getImplicitConstraintTargetInAmbiguousConfigurationException;
    }
    @Override
    public final ConstraintDeclarationException getImplicitConstraintTargetInAmbiguousConfigurationException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getImplicitConstraintTargetInAmbiguousConfigurationException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCrossParameterConstraintOnMethodWithoutParametersException = "HV000142: Cross parameter constraint %1$s is illegally placed on a parameterless method or constructor '%2$s'.";
    protected String getCrossParameterConstraintOnMethodWithoutParametersException$str() {
        return getCrossParameterConstraintOnMethodWithoutParametersException;
    }
    @Override
    public final ConstraintDeclarationException getCrossParameterConstraintOnMethodWithoutParametersException(final Class<? extends java.lang.annotation.Annotation> constraint, final Member member) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getCrossParameterConstraintOnMethodWithoutParametersException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint), member));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCrossParameterConstraintOnClassException = "HV000143: Cross parameter constraint %1$s is illegally placed on class level.";
    protected String getCrossParameterConstraintOnClassException$str() {
        return getCrossParameterConstraintOnClassException;
    }
    @Override
    public final ConstraintDeclarationException getCrossParameterConstraintOnClassException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getCrossParameterConstraintOnClassException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCrossParameterConstraintOnFieldException = "HV000144: Cross parameter constraint %1$s is illegally placed on field '%2$s'.";
    protected String getCrossParameterConstraintOnFieldException$str() {
        return getCrossParameterConstraintOnFieldException;
    }
    @Override
    public final ConstraintDeclarationException getCrossParameterConstraintOnFieldException(final Class<? extends java.lang.annotation.Annotation> constraint, final Member field) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getCrossParameterConstraintOnFieldException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint), field));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParameterNodeAddedForNonCrossParameterConstraintException = "HV000146: No parameter nodes may be added since path %s doesn't refer to a cross-parameter constraint.";
    protected String getParameterNodeAddedForNonCrossParameterConstraintException$str() {
        return getParameterNodeAddedForNonCrossParameterConstraintException;
    }
    @Override
    public final IllegalStateException getParameterNodeAddedForNonCrossParameterConstraintException(final Path path) {
        final IllegalStateException result = new IllegalStateException(String.format(getLoggingLocale(), getParameterNodeAddedForNonCrossParameterConstraintException$str(), path));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstrainedElementConfiguredMultipleTimesException = "HV000147: %1$s is configured multiple times (note, <getter> and <method> nodes for the same method are not allowed)";
    protected String getConstrainedElementConfiguredMultipleTimesException$str() {
        return getConstrainedElementConfiguredMultipleTimesException;
    }
    @Override
    public final ValidationException getConstrainedElementConfiguredMultipleTimesException(final String location) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getConstrainedElementConfiguredMultipleTimesException$str(), location));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void evaluatingExpressionLanguageExpressionCausedException(final String expression, final Exception e) {
        super.log.logf(FQCN, WARN, e, evaluatingExpressionLanguageExpressionCausedException$str(), expression);
    }
    private static final String evaluatingExpressionLanguageExpressionCausedException = "HV000148: An exception occurred during evaluation of EL expression '%s'";
    protected String evaluatingExpressionLanguageExpressionCausedException$str() {
        return evaluatingExpressionLanguageExpressionCausedException;
    }
    private static final String getExceptionOccurredDuringMessageInterpolationException = "HV000149: An exception occurred during message interpolation";
    protected String getExceptionOccurredDuringMessageInterpolationException$str() {
        return getExceptionOccurredDuringMessageInterpolationException;
    }
    @Override
    public final ValidationException getExceptionOccurredDuringMessageInterpolationException(final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getExceptionOccurredDuringMessageInterpolationException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMultipleValidatorsForSameTypeException = "HV000150: The constraint %1$s defines multiple validators for the type %2$s: %3$s, %4$s. Only one is allowed.";
    protected String getMultipleValidatorsForSameTypeException$str() {
        return getMultipleValidatorsForSameTypeException;
    }
    @Override
    public final UnexpectedTypeException getMultipleValidatorsForSameTypeException(final Class<? extends java.lang.annotation.Annotation> constraint, final Type type, final Class<? extends javax.validation.ConstraintValidator<?, ?>> validatorClass1, final Class<? extends javax.validation.ConstraintValidator<?, ?>> validatorClass2) {
        final UnexpectedTypeException result = new UnexpectedTypeException(String.format(getLoggingLocale(), getMultipleValidatorsForSameTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint), type, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatorClass1), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatorClass2)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParameterConfigurationAlteredInSubTypeException = "HV000151: A method overriding another method must not alter the parameter constraint configuration, but method %2$s changes the configuration of %1$s.";
    protected String getParameterConfigurationAlteredInSubTypeException$str() {
        return getParameterConfigurationAlteredInSubTypeException;
    }
    @Override
    public final ConstraintDeclarationException getParameterConfigurationAlteredInSubTypeException(final Member superMethod, final Member subMethod) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getParameterConfigurationAlteredInSubTypeException$str(), superMethod, subMethod));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParameterConstraintsDefinedInMethodsFromParallelTypesException = "HV000152: Two methods defined in parallel types must not declare parameter constraints, if they are overridden by the same method, but methods %s and %s both define parameter constraints.";
    protected String getParameterConstraintsDefinedInMethodsFromParallelTypesException$str() {
        return getParameterConstraintsDefinedInMethodsFromParallelTypesException;
    }
    @Override
    public final ConstraintDeclarationException getParameterConstraintsDefinedInMethodsFromParallelTypesException(final Member method1, final Member method2) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getParameterConstraintsDefinedInMethodsFromParallelTypesException$str(), method1, method2));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException = "HV000153: The constraint %1$s used ConstraintTarget#%2$s but is not specified on a method or constructor.";
    protected String getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException$str() {
        return getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException;
    }
    @Override
    public final ConstraintDeclarationException getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException(final Class<? extends java.lang.annotation.Annotation> constraint, final ConstraintTarget target) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint), target));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCrossParameterConstraintHasNoValidatorException = "HV000154: Cross parameter constraint %1$s has no cross-parameter validator.";
    protected String getCrossParameterConstraintHasNoValidatorException$str() {
        return getCrossParameterConstraintHasNoValidatorException;
    }
    @Override
    public final ConstraintDefinitionException getCrossParameterConstraintHasNoValidatorException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getCrossParameterConstraintHasNoValidatorException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getComposedAndComposingConstraintsHaveDifferentTypesException = "HV000155: Composed and composing constraints must have the same constraint type, but composed constraint %1$s has type %3$s, while composing constraint %2$s has type %4$s.";
    protected String getComposedAndComposingConstraintsHaveDifferentTypesException$str() {
        return getComposedAndComposingConstraintsHaveDifferentTypesException;
    }
    @Override
    public final ConstraintDefinitionException getComposedAndComposingConstraintsHaveDifferentTypesException(final Class<? extends java.lang.annotation.Annotation> composedConstraintClass, final Class<? extends java.lang.annotation.Annotation> composingConstraintClass, final ConstraintType composedConstraintType, final ConstraintType composingConstraintType) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getComposedAndComposingConstraintsHaveDifferentTypesException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(composedConstraintClass), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(composingConstraintClass), composedConstraintType, composingConstraintType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException = "HV000156: Constraints with generic as well as cross-parameter validators must define an attribute validationAppliesTo(), but constraint %s doesn't.";
    protected String getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException$str() {
        return getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException;
    }
    @Override
    public final ConstraintDefinitionException getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException = "HV000157: Return type of the attribute validationAppliesTo() of the constraint %s must be javax.validation.ConstraintTarget.";
    protected String getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException$str() {
        return getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException;
    }
    @Override
    public final ConstraintDefinitionException getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getValidationAppliesToParameterMustHaveDefaultValueImplicitException = "HV000158: Default value of the attribute validationAppliesTo() of the constraint %s must be ConstraintTarget#IMPLICIT.";
    protected String getValidationAppliesToParameterMustHaveDefaultValueImplicitException$str() {
        return getValidationAppliesToParameterMustHaveDefaultValueImplicitException;
    }
    @Override
    public final ConstraintDefinitionException getValidationAppliesToParameterMustHaveDefaultValueImplicitException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getValidationAppliesToParameterMustHaveDefaultValueImplicitException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException = "HV000159: Only constraints with generic as well as cross-parameter validators must define an attribute validationAppliesTo(), but constraint %s does.";
    protected String getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException$str() {
        return getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException;
    }
    @Override
    public final ConstraintDefinitionException getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException = "HV000160: Validator for cross-parameter constraint %s does not validate Object nor Object[].";
    protected String getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException$str() {
        return getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException;
    }
    @Override
    public final ConstraintDefinitionException getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException(final Class<? extends java.lang.annotation.Annotation> constraint) {
        final ConstraintDefinitionException result = new ConstraintDefinitionException(String.format(getLoggingLocale(), getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException = "HV000161: Two methods defined in parallel types must not define group conversions for a cascaded method return value, if they are overridden by the same method, but methods %s and %s both define parameter constraints.";
    protected String getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException$str() {
        return getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException;
    }
    @Override
    public final ConstraintDeclarationException getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException(final Member method1, final Member method2) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException$str(), method1, method2));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMethodOrConstructorNotDefinedByValidatedTypeException = "HV000162: The validated type %1$s does not specify the constructor/method: %2$s";
    protected String getMethodOrConstructorNotDefinedByValidatedTypeException$str() {
        return getMethodOrConstructorNotDefinedByValidatedTypeException;
    }
    @Override
    public final IllegalArgumentException getMethodOrConstructorNotDefinedByValidatedTypeException(final Class<?> validatedType, final Member member) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMethodOrConstructorNotDefinedByValidatedTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(validatedType), member));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParameterTypesDoNotMatchException = "HV000163: The actual parameter type '%1$s' is not assignable to the expected one '%2$s' for parameter %3$d of '%4$s'";
    protected String getParameterTypesDoNotMatchException$str() {
        return getParameterTypesDoNotMatchException;
    }
    @Override
    public final IllegalArgumentException getParameterTypesDoNotMatchException(final Class<?> actualType, final Type expectedType, final int index, final Member member) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getParameterTypesDoNotMatchException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(actualType), expectedType, index, member));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getHasToBeABoxedTypeException = "HV000164: %s has to be a auto-boxed type.";
    protected String getHasToBeABoxedTypeException$str() {
        return getHasToBeABoxedTypeException;
    }
    @Override
    public final IllegalArgumentException getHasToBeABoxedTypeException(final Class<?> clazz) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getHasToBeABoxedTypeException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(clazz)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMixingImplicitWithOtherExecutableTypesException = "HV000165: Mixing IMPLICIT and other executable types is not allowed.";
    protected String getMixingImplicitWithOtherExecutableTypesException$str() {
        return getMixingImplicitWithOtherExecutableTypesException;
    }
    @Override
    public final IllegalArgumentException getMixingImplicitWithOtherExecutableTypesException() {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMixingImplicitWithOtherExecutableTypesException$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getValidateOnExecutionOnOverriddenOrInterfaceMethodException = "HV000166: @ValidateOnExecution is not allowed on methods overriding a superclass method or implementing an interface. Check configuration for %1$s";
    protected String getValidateOnExecutionOnOverriddenOrInterfaceMethodException$str() {
        return getValidateOnExecutionOnOverriddenOrInterfaceMethodException;
    }
    @Override
    public final ValidationException getValidateOnExecutionOnOverriddenOrInterfaceMethodException(final Method m) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getValidateOnExecutionOnOverriddenOrInterfaceMethodException$str(), m));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getOverridingConstraintDefinitionsInMultipleMappingFilesException = "HV000167: A given constraint definition can only be overridden in one mapping file. %1$s is overridden in multiple files";
    protected String getOverridingConstraintDefinitionsInMultipleMappingFilesException$str() {
        return getOverridingConstraintDefinitionsInMultipleMappingFilesException;
    }
    @Override
    public final ValidationException getOverridingConstraintDefinitionsInMultipleMappingFilesException(final String constraintClassName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getOverridingConstraintDefinitionsInMultipleMappingFilesException$str(), constraintClassName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNonTerminatedParameterException = "HV000168: The message descriptor '%1$s' contains an unbalanced meta character '%2$c' parameter.";
    protected String getNonTerminatedParameterException$str() {
        return getNonTerminatedParameterException;
    }
    @Override
    public final MessageDescriptorFormatException getNonTerminatedParameterException(final String messageDescriptor, final char character) {
        final MessageDescriptorFormatException result = new MessageDescriptorFormatException(String.format(getLoggingLocale(), getNonTerminatedParameterException$str(), messageDescriptor, character));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNestedParameterException = "HV000169: The message descriptor '%1$s' has nested parameters.";
    protected String getNestedParameterException$str() {
        return getNestedParameterException;
    }
    @Override
    public final MessageDescriptorFormatException getNestedParameterException(final String messageDescriptor) {
        final MessageDescriptorFormatException result = new MessageDescriptorFormatException(String.format(getLoggingLocale(), getNestedParameterException$str(), messageDescriptor));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCreationOfScriptExecutorFailedException = "HV000170: No JSR-223 scripting engine could be bootstrapped for language \"%s\".";
    protected String getCreationOfScriptExecutorFailedException$str() {
        return getCreationOfScriptExecutorFailedException;
    }
    @Override
    public final ConstraintDeclarationException getCreationOfScriptExecutorFailedException(final String languageName, final Exception e) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getCreationOfScriptExecutorFailedException$str(), languageName), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000171: %s is configured more than once via the programmatic constraint declaration API.";
    protected String getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000172: Property \"%2$s\" of type %1$s is configured more than once via the programmatic constraint declaration API.";
    protected String getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String propertyName) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), propertyName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMethodHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000173: Method %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    protected String getMethodHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getMethodHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getMethodHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String method) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getMethodHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), method));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getParameterHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000174: Parameter %3$s of method or constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    protected String getParameterHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getParameterHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getParameterHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String executable, final int parameterIndex) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getParameterHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), executable, parameterIndex));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000175: The return value of method or constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    protected String getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String executable) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), executable));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000176: Constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    protected String getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String constructor) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), constructor));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException = "HV000177: Cross-parameter constraints for the method or constructor %2$s of type %1$s are declared more than once via the programmatic constraint declaration API.";
    protected String getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException(final Class<?> beanClass, final String executable) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass), executable));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getMultiplierCannotBeNegativeException = "HV000178: Multiplier cannot be negative: %d.";
    protected String getMultiplierCannotBeNegativeException$str() {
        return getMultiplierCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getMultiplierCannotBeNegativeException(final int multiplier) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getMultiplierCannotBeNegativeException$str(), multiplier));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getWeightCannotBeNegativeException = "HV000179: Weight cannot be negative: %d.";
    protected String getWeightCannotBeNegativeException$str() {
        return getWeightCannotBeNegativeException;
    }
    @Override
    public final IllegalArgumentException getWeightCannotBeNegativeException(final int weight) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getWeightCannotBeNegativeException$str(), weight));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getTreatCheckAsIsNotADigitNorALetterException = "HV000180: '%c' is not a digit nor a letter.";
    protected String getTreatCheckAsIsNotADigitNorALetterException$str() {
        return getTreatCheckAsIsNotADigitNorALetterException;
    }
    @Override
    public final IllegalArgumentException getTreatCheckAsIsNotADigitNorALetterException(final int weight) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getTreatCheckAsIsNotADigitNorALetterException$str(), weight));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getInvalidParameterCountForExecutableException = "HV000181: Wrong number of parameters. Method or constructor %1$s expects %2$d parameters, but got %3$d.";
    protected String getInvalidParameterCountForExecutableException$str() {
        return getInvalidParameterCountForExecutableException;
    }
    @Override
    public final IllegalArgumentException getInvalidParameterCountForExecutableException(final String executable, final int expectedParameterCount, final int actualParameterCount) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(getLoggingLocale(), getInvalidParameterCountForExecutableException$str(), executable, expectedParameterCount, actualParameterCount));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getNoUnwrapperFoundForTypeException = "HV000182: No validation value unwrapper is registered for type '%1$s'.";
    protected String getNoUnwrapperFoundForTypeException$str() {
        return getNoUnwrapperFoundForTypeException;
    }
    @Override
    public final ValidationException getNoUnwrapperFoundForTypeException(final Type type) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getNoUnwrapperFoundForTypeException$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToInitializeELExpressionFactoryException = "HV000183: Unable to initialize 'javax.el.ExpressionFactory'. Check that you have the EL dependencies on the classpath, or use ParameterMessageInterpolator instead";
    protected String getUnableToInitializeELExpressionFactoryException$str() {
        return getUnableToInitializeELExpressionFactoryException;
    }
    @Override
    public final ValidationException getUnableToInitializeELExpressionFactoryException(final Throwable e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToInitializeELExpressionFactoryException$str()), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void creationOfParameterMessageInterpolation() {
        super.log.logf(FQCN, WARN, null, creationOfParameterMessageInterpolation$str());
    }
    private static final String creationOfParameterMessageInterpolation = "HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported";
    protected String creationOfParameterMessageInterpolation$str() {
        return creationOfParameterMessageInterpolation;
    }
    @Override
    public final void getElUnsupported(final String expression) {
        super.log.logf(FQCN, WARN, null, getElUnsupported$str(), expression);
    }
    private static final String getElUnsupported = "HV000185: Message contains EL expression: %1s, which is unsupported with chosen Interpolator";
    protected String getElUnsupported$str() {
        return getElUnsupported;
    }
    private static final String getConstraintValidatorExistsForWrapperAndWrappedValueException = "HV000186: The constraint of type '%2$s' defined on '%1$s' has multiple matching constraint validators which is due to an additional value handler of type '%3$s'. It is unclear which value needs validating. Clarify configuration via @UnwrapValidatedValue.";
    protected String getConstraintValidatorExistsForWrapperAndWrappedValueException$str() {
        return getConstraintValidatorExistsForWrapperAndWrappedValueException;
    }
    @Override
    public final UnexpectedTypeException getConstraintValidatorExistsForWrapperAndWrappedValueException(final Path property, final Class<? extends java.lang.annotation.Annotation> constraint, final Class<? extends org.hibernate.validator.spi.valuehandling.ValidatedValueUnwrapper> valueHandler) {
        final UnexpectedTypeException result = new UnexpectedTypeException(String.format(getLoggingLocale(), getConstraintValidatorExistsForWrapperAndWrappedValueException$str(), property, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(constraint), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(valueHandler)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getTypeAnnotationConstraintOnIterableRequiresUseOfValidAnnotationException = "HV000187: When using type annotation constraints on parameterized iterables or map @Valid must be used. Check %s#%s";
    protected String getTypeAnnotationConstraintOnIterableRequiresUseOfValidAnnotationException$str() {
        return getTypeAnnotationConstraintOnIterableRequiresUseOfValidAnnotationException;
    }
    @Override
    public final ValidationException getTypeAnnotationConstraintOnIterableRequiresUseOfValidAnnotationException(final Class<?> declaringClass, final String name) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getTypeAnnotationConstraintOnIterableRequiresUseOfValidAnnotationException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(declaringClass), name));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void parameterizedTypeWithMoreThanOneTypeArgumentIsNotSupported(final Type type) {
        super.log.logf(FQCN, DEBUG, null, parameterizedTypeWithMoreThanOneTypeArgumentIsNotSupported$str(), type);
    }
    private static final String parameterizedTypeWithMoreThanOneTypeArgumentIsNotSupported = "HV000188: Parameterized type with more than one argument is not supported: %s";
    protected String parameterizedTypeWithMoreThanOneTypeArgumentIsNotSupported$str() {
        return parameterizedTypeWithMoreThanOneTypeArgumentIsNotSupported;
    }
    private static final String getInconsistentValueUnwrappingConfigurationBetweenFieldAndItsGetterException = "HV000189: The configuration of value unwrapping for property '%s' of bean '%s' is inconsistent between the field and its getter.";
    protected String getInconsistentValueUnwrappingConfigurationBetweenFieldAndItsGetterException$str() {
        return getInconsistentValueUnwrappingConfigurationBetweenFieldAndItsGetterException;
    }
    @Override
    public final ConstraintDeclarationException getInconsistentValueUnwrappingConfigurationBetweenFieldAndItsGetterException(final String property, final Class<?> beanClass) {
        final ConstraintDeclarationException result = new ConstraintDeclarationException(String.format(getLoggingLocale(), getInconsistentValueUnwrappingConfigurationBetweenFieldAndItsGetterException$str(), property, new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(beanClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToCreateXMLEventReader = "HV000190: Unable to parse %s.";
    protected String getUnableToCreateXMLEventReader$str() {
        return getUnableToCreateXMLEventReader;
    }
    @Override
    public final ValidationException getUnableToCreateXMLEventReader(final String file, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToCreateXMLEventReader$str(), file), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String validatedValueUnwrapperCannotBeCreated = "HV000191: Error creating unwrapper: %s";
    protected String validatedValueUnwrapperCannotBeCreated$str() {
        return validatedValueUnwrapperCannotBeCreated;
    }
    @Override
    public final ValidationException validatedValueUnwrapperCannotBeCreated(final String className, final Exception e) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), validatedValueUnwrapperCannotBeCreated$str(), className), e);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void unknownJvmVersion(final String vmVersionStr) {
        super.log.logf(FQCN, WARN, null, unknownJvmVersion$str(), vmVersionStr);
    }
    private static final String unknownJvmVersion = "HV000192: Couldn't determine Java version from value %1s; Not enabling features requiring Java 8";
    protected String unknownJvmVersion$str() {
        return unknownJvmVersion;
    }
    private static final String getConstraintHasAlreadyBeenConfiguredViaProgrammaticApiException = "HV000193: %s is configured more than once via the programmatic constraint definition API.";
    protected String getConstraintHasAlreadyBeenConfiguredViaProgrammaticApiException$str() {
        return getConstraintHasAlreadyBeenConfiguredViaProgrammaticApiException;
    }
    @Override
    public final ValidationException getConstraintHasAlreadyBeenConfiguredViaProgrammaticApiException(final Class<? extends java.lang.annotation.Annotation> annotationClass) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getConstraintHasAlreadyBeenConfiguredViaProgrammaticApiException$str(), new org.hibernate.validator.internal.util.logging.formatter.ClassObjectFormatter(annotationClass)));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getEmptyElementOnlySupportedWhenCharSequenceIsExpectedExpection = "HV000194: An empty element is only supported when a CharSequence is expected.";
    protected String getEmptyElementOnlySupportedWhenCharSequenceIsExpectedExpection$str() {
        return getEmptyElementOnlySupportedWhenCharSequenceIsExpectedExpection;
    }
    @Override
    public final ValidationException getEmptyElementOnlySupportedWhenCharSequenceIsExpectedExpection() {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getEmptyElementOnlySupportedWhenCharSequenceIsExpectedExpection$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToReachPropertyToValidateException = "HV000195: Unable to reach the property to validate for the bean %s and the property path %s. A property is null along the way.";
    protected String getUnableToReachPropertyToValidateException$str() {
        return getUnableToReachPropertyToValidateException;
    }
    @Override
    public final ValidationException getUnableToReachPropertyToValidateException(final Object bean, final Path path) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToReachPropertyToValidateException$str(), bean, path));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String getUnableToConvertTypeToClassException = "HV000196: Unable to convert the Type %s to a Class.";
    protected String getUnableToConvertTypeToClassException$str() {
        return getUnableToConvertTypeToClassException;
    }
    @Override
    public final ValidationException getUnableToConvertTypeToClassException(final Type type) {
        final ValidationException result = new ValidationException(String.format(getLoggingLocale(), getUnableToConvertTypeToClassException$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
}
