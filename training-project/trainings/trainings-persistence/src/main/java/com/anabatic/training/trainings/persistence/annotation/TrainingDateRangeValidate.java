package com.anabatic.training.trainings.persistence.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.anabatic.training.trainings.persistence.validator.object.TrainingDateRangeValidator;
import com.anabatit.training.trainings.core.constant.TrainingErrorConstant;

@Documented
@Constraint(validatedBy = TrainingDateRangeValidator.class)
@Target( {ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface TrainingDateRangeValidate {
	String message() default TrainingErrorConstant.INVALID_DATERANGE_KEY;
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface List {
		TrainingDateRangeValidate[] value();
	}
}
