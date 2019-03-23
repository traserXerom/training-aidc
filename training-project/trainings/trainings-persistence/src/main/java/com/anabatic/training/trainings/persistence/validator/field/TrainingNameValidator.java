package com.anabatic.training.trainings.persistence.validator.field;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.anabatic.training.trainings.persistence.annotation.TrainingNameValidate;

public class TrainingNameValidator implements ConstraintValidator<TrainingNameValidate, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value==null)return true;
		
		if(value.contains("name"))return true;
		else return false;
	}

}
