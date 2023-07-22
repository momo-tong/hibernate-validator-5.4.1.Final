/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.metadata.aggregated.rule;

import org.hibernate.validator.internal.metadata.raw.ConstrainedExecutable;

/**
 * Rule that ensures that methods in parallel types don't define group
 * conversions for methods marked as cascaded in one of the parallel types.
 *
 * @author Gunnar Morling
 */
public class ParallelMethodsMustNotDefineGroupConversionForCascadedReturnValue extends MethodConfigurationRule {

	@Override
	public void apply(ConstrainedExecutable method, ConstrainedExecutable otherMethod) {
		boolean isCascaded = method.isCascading() || otherMethod.isCascading();
		boolean hasGroupConversions = !method.getGroupConversions().isEmpty() || !otherMethod.getGroupConversions()
				.isEmpty();

		if ( isDefinedOnParallelType( method, otherMethod ) && isCascaded && hasGroupConversions ) {
			throw log.getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException(
					method.getLocation().getMember(),
					otherMethod.getLocation().getMember()
			);
		}
	}
}
