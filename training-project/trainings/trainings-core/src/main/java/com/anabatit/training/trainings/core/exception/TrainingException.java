package com.anabatit.training.trainings.core.exception;

import com.anabatic.generic.core.exception.GeneralException;

public class TrainingException extends GeneralException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	public TrainingException(GeneralException e) {
		super(e.getAllErrors(), e.getHttpStatus());
		// TODO Auto-generated constructor stub
	}

	
	

}
