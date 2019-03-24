package com.anabatic.training.trainings.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="training_user")
public class TrainingUser extends TypicalGenericModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="training_user_id")
	private Long id;
	
	@Column(name="user_id")
	private Long userId;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="training_id")
	@JsonIgnore
	private Training training;
	
	public TrainingUser() {
		super();
	}

	public TrainingUser(Long id, Long userId, Training training) {
		super();
		this.id = id;
		this.userId = userId;
		this.training = training;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	@Override
	public String toString() {
		return "TrainingUser [id=" + id + ", userId=" + userId + ", training=" + training.toString() + "]";
	}
	
	

}
