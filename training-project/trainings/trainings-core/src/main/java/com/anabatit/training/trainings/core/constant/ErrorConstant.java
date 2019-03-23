package com.anabatit.training.trainings.core.constant;

import java.util.HashMap;

import com.anabatic.generic.core.exception.Error;

public class ErrorConstant  {
	
	public static final Error INVALID_TRAININGNAME = new Error("TRG-001", "Training name value must contain word name", "Nilai nama training harus terdiri dari kata nama", 400);

	protected static HashMap<String, Error> errors ;
	static {
		
        errors.put("INVALID_TRAININGNAME", INVALID_TRAININGNAME);
	}

	/**
	 * @param exceptionKey ErrorConstant String value
	 * @return {@link Error} based of key string value
	 * @author kusmawati
	 **/
	public static final Error getError (String exceptionKey){
		Error err =errors.get(exceptionKey);
		return err;
	}
}
