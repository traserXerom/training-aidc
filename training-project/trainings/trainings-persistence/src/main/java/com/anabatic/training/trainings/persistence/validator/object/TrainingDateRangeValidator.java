package com.anabatic.training.trainings.persistence.validator.object;

import java.lang.reflect.Field;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.anabatic.training.trainings.persistence.annotation.TrainingDateRangeValidate;

public class TrainingDateRangeValidator implements ConstraintValidator<TrainingDateRangeValidate, Object>{

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		Date endDate;
		Date startDate;
		
		context.disableDefaultConstraintViolation();
		Field field = null;
		try {
			field = obj.getClass().getDeclaredField("trainingEndDate");
			field.setAccessible(true);
			if (field.getType() == Date.class) {
				if (field.get(obj) == null || field.get(obj).toString().equals("")) {
					throw new NullPointerException();
				}
				endDate = (Date) field.get(obj);

				field = obj.getClass().getDeclaredField("trainingStartDate");
				field.setAccessible(true);

				if (field.get(obj) == null) {
					throw new NullPointerException();
				}
				startDate = (Date) field.get(obj);
				
				if(startDate.compareTo(endDate)<0) {
					return true;
				}else return false;
			} else {
				throw new NullPointerException();
			}
		} catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
			throw new NullPointerException();
		}	
	}

}
