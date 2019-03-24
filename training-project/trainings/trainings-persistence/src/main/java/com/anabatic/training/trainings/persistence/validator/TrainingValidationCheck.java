package com.anabatic.training.trainings.persistence.validator;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.GeneralException;
import com.anabatic.generic.persistence.validator.field.ValidationCheck;
import com.anabatit.training.trainings.core.constant.TrainingErrorConstant;
import com.anabatit.training.trainings.core.exception.TrainingException;

public class TrainingValidationCheck  {
	
	public static <O, T extends ErrorConstant> void hasValidate(O object){
		try {
			ValidationCheck.hasValidate(object, TrainingErrorConstant.class);
		}catch (GeneralException e) {
			throw new TrainingException(e);
		}
		
	}
	
}
