package com.anabatic.training.trainings.endpoint.param.contract;

public class TrainingUserRequest {

	private Long userId;
	private Long trainingId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}
	
	
}
