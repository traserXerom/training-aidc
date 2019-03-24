package com.anabatic.training.trainings.endpoint.param.contract;

import java.util.Date;

import com.anabatic.training.trainings.persistence.annotation.TrainingNameValidate;

public class TrainingRequest {
	private Long id;
	
	@TrainingNameValidate
	private String trainingName;
	
	private String training_description;
	private String location;
	private Date trainingDate;
	private String trainerName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTraining_description() {
		return training_description;
	}
	public void setTraining_description(String training_description) {
		this.training_description = training_description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getTrainingDate() {
		return trainingDate;
	}
	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
}
