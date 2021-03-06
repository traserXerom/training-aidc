package com.anabatic.training.trainings.endpoint.param.bean;

import java.util.Date;

import com.anabatic.training.trainings.persistence.annotation.TrainingNameValidate;

public class TrainingBean {
	private Long id;
	
	@TrainingNameValidate
	private String trainingName;
	private String training_description;
	private String location;
	private Date trainingStartDate;
	private Date trainingEndDate;
	private String trainerName;
	private Integer time;
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
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public Date getTrainingStartDate() {
		return trainingStartDate;
	}
	public void setTrainingStartDate(Date trainingStartDate) {
		this.trainingStartDate = trainingStartDate;
	}
	public Date getTrainingEndDate() {
		return trainingEndDate;
	}
	public void setTrainingEndDate(Date trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	
}
