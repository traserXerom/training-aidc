package com.anabatic.training.trainings.endpoint.param.contract;

import com.anabatic.training.trainings.endpoint.param.bean.TrainingBean;
import com.anabatic.training.trainings.persistence.annotation.TrainingDateRangeValidate;

@TrainingDateRangeValidate
public class TrainingUserRequest {

	private Long id;
	private Long userId;
	private TrainingBean trainingBean;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TrainingBean getTrainingBean() {
		return trainingBean;
	}
	public void setTrainingBean(TrainingBean trainingBean) {
		this.trainingBean = trainingBean;
	}
	
	
}
