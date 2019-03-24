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

import com.anabatic.generic.core.util.DateUtil;
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
	
	@Column(name="training_start_date")
	private Date trainingStartDate;
	
	@Column(name="training_end_date")
	private Date trainingEndDate;
	
	@Column(name="trainer_name")
	private String trainerName;
	
	@Column(name="training_time")
	private Integer time;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="training_id")
	@JsonIgnore
	private Training training;
	
	public TrainingDetail() {
		super();
	}

	public TrainingDetail(Long id, String location, Date trainingStartDate, Date trainingEndDate, String trainerName,
			Integer time, Training training) {
		super();
		this.id = id;
		this.location = location;
		this.trainingStartDate = trainingStartDate;
		this.trainingEndDate = trainingEndDate;
		this.trainerName = trainerName;
		this.time = time;
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

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
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

	@Override
	public String toString() {
		return "TrainingDetail [id=" + id + ", location=" + location + ", trainingStartDate=" + DateUtil.convertDateToString(trainingStartDate)
				+ ", trainingEndDate=" + DateUtil.convertDateToString(trainingEndDate) + ", trainerName=" + trainerName + ", time=" + time
				+  "]";
	}

	
}
