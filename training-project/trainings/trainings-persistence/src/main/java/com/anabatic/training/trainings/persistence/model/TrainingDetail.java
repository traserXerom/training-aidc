package com.anabatic.training.trainings.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="training_detail")
public class TrainingDetail extends TypicalGenericModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="training_detail_id")
	private Long id;
	
	@Column(name="training_location")
	private String location;
	
	@Column(name="training_date")
	private Date trainingDate;
	
	@Column(name="trainer_name")
	private String trainingName;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="training_id")
	@JsonIgnore
	private Training training;
	
	public TrainingDetail() {
		super();
	}

	public TrainingDetail(Long id, String location, Date trainingDate, String trainingName, Training training) {
		super();
		this.id = id;
		this.location = location;
		this.trainingDate = trainingDate;
		this.trainingName = trainingName;
		this.training = training;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	@Override
	public String toString() {
		return "TrainingDetail [id=" + id + ", location=" + location + ", trainingDate=" + trainingDate
				+ ", trainingName=" + trainingName + ", training=" + training + "]";
	}
	
	
	
}
