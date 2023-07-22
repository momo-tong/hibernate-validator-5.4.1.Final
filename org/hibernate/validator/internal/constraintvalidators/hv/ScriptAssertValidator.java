/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.constraintvalidators.hv;

import static org.hibernate.validator.internal.util.logging.Messages.MESSAGES;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.constraints.ScriptAssert;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.hibernate.validator.internal.engine.messageinterpolation.util.InterpolationHelper;
import org.hibernate.validator.internal.util.Contracts;

/**
 * Validator for the {@link ScriptAssert} constraint annotation.
 *
 * @author Gunnar Morling
 * @author Hardy Ferentschik
 * @author Kevin Pollet &lt;kevin.pollet@serli.com&gt; (C) 2011 SERLI
 * @author Marko Bekhta
 * @author Guillaume Smet
 */
public class ScriptAssertValidator implements ConstraintValidator<ScriptAssert, Object> {

	private String alias;
	private String reportOn;
	private String message;
	private ScriptAssertContext scriptAssertContext;
	private String escapedScript;

	@Override
	public void initialize(ScriptAssert constraintAnnotation) {
		validateParameters( constraintAnnotation );

		this.alias = constraintAnnotation.alias();
		this.reportOn = constraintAnnotation.reportOn();
		this.message = constraintAnnotation.message();
		this.scriptAssertContext = new ScriptAssertContext( constraintAnnotation.lang(), constraintAnnotation.script() );
		this.escapedScript = InterpolationHelper.escapeMessageParameter( constraintAnnotation.script() );
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
		if ( constraintValidatorContext instanceof HibernateConstraintValidatorContext ) {
			constraintValidatorContext.unwrap( HibernateConstraintValidatorContext.class ).addMessageParameter( "script", escapedScript );
		}

		boolean validationResult = scriptAssertContext.evaluateScriptAssertExpression( value, alias );

		if ( !validationResult && !reportOn.isEmpty() ) {
			constraintValidatorContext.disableDefaultConstraintViolation();
			constraintValidatorContext.buildConstraintViolationWithTemplate( message ).addPropertyNode( reportOn ).addConstraintViolation();
		}

		return validationResult;
	}

	private void validateParameters(ScriptAssert constraintAnnotation) {
		Contracts.assertNotEmpty( constraintAnnotation.script(), MESSAGES.parameterMustNotBeEmpty( "script" ) );
		Contracts.assertNotEmpty( constraintAnnotation.lang(), MESSAGES.parameterMustNotBeEmpty( "lang" ) );
		Contracts.assertNotEmpty( constraintAnnotation.alias(), MESSAGES.parameterMustNotBeEmpty( "alias" ) );
	}
}
