package com.anabatic.training.trainings.persistence.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anabatic.training.trainings.persistence.validator.field.TrainingNameValidator;
import com.anabatit.training.trainings.core.constant.TrainingErrorConstant;


@Documented
@Constraint(validatedBy= TrainingNameValidator.class)
@Target( {ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TrainingNameValidate {

	String message() default TrainingErrorConstant.INVALID_TRAININGNAME_KEY;
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ ElementType.FIELD })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface List {
		TrainingNameValidate[] value();
	}
}
