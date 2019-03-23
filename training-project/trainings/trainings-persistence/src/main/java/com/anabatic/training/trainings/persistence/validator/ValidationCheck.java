package com.anabatic.training.trainings.persistence.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.anabatic.generic.core.exception.Error;
import com.anabatic.generic.core.exception.GeneralException;
import com.anabatic.generic.persistence.validator.field.OsgiServiceDiscoverer;
import com.anabatit.training.trainings.core.constant.ErrorConstant;


/**
 *  Validate All Custom validation
 *
 * @author taufik.muliahadi (&copy;Sep 14, 2018) 
 */
public class ValidationCheck {

	public static <T> void hasValidate(T t){
		List<Error> errors = new ArrayList<>();
		ValidatorFactory validatorFactory = 
				Validation.byDefaultProvider()
				.providerResolver(new OsgiServiceDiscoverer())
				.configure().buildValidatorFactory();
		
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<T>> violations = 
				validator.validate(t);

		if (violations != null && !violations.isEmpty()) {
			for (ConstraintViolation<T> violation : violations) {
				String msg = violation.getMessage();
				
				Error baseError = ErrorConstant.getError(msg);
				Error error = new Error(baseError.getErrorCode(), 
						baseError.getErrorMessage(), 
						baseError.getErrorLocaleMessage());
				
				Error tmp = errors.stream().filter(x -> error.getErrorCode()
						.equals(x.getErrorCode())).findAny().orElse(null);
				
				if (tmp == null) {
					error.addField(violation.getPropertyPath().toString());
					errors.add(error);
				}else if (tmp != null) {
					errors.forEach(x -> {
						if (x.getErrorCode() == tmp.getErrorCode()) {
							x.addField(violation.getPropertyPath().toString());
						}
					});
					}
				}
			throw new GeneralException(errors, 400);
			}
			
		}
}
