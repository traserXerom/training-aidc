package com.anabatit.training.trainings.core.constant;

import com.anabatic.generic.core.constant.ErrorConstant;
import com.anabatic.generic.core.exception.Error;

public class TrainingErrorConstant extends ErrorConstant  {
	
	public static final Error INVALID_TRAININGNAME = new Error("TRG-001", "Training name value must contain word name", "Nilai nama training harus terdiri dari kata nama", 400);
	public static final Error INVALID_DATERANGE = new Error("TRG-002", "Training start date must be earliar than end date.", "Tanggal mulai training harus lebih dulu dari tanggal akhir", 400);
	
	public static final String INVALID_TRAININGNAME_KEY = "INVALID_TRAININGNAME";
	public static final String INVALID_DATERANGE_KEY = "INVALID_DATERANGE";
	
	static {
		
        errors.put("INVALID_TRAININGNAME", INVALID_TRAININGNAME);
        errors.put("INVALID_DATERANGE", INVALID_DATERANGE);
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
