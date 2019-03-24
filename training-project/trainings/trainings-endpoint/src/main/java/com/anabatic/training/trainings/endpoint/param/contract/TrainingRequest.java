package com.anabatic.training.trainings.endpoint.param.contract;

import javax.validation.Valid;

import com.anabatic.training.trainings.endpoint.param.bean.TrainingBean;

public class TrainingRequest {
	@Valid
	private TrainingBean training;

	public TrainingBean getTraining() {
		return training;
	}

	public void setTraining(TrainingBean training) {
		this.training = training;
	}
	
	
}
