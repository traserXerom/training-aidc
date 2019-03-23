package com.anabatic.training.trainings.persistence.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;

@Entity
@Table(name="core_training")
public class Training extends TypicalGenericModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="training_id")
	private Long id;
	
	@Column(name="training_name")
	private String name;
	
	@Column(name="training_description")
	private String description;
	
	@OneToOne(mappedBy="training", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private TrainingDetail trainingDetail;
	
	@OneToMany(mappedBy="training", fetch=FetchType.LAZY)
	private List<TrainingUser> trainingUsers;

	public Training() {
		super();
	}
	
	public Training(Long id, String name, String description, TrainingDetail trainingDetail,
			List<TrainingUser> trainingUsers) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.trainingDetail = trainingDetail;
		this.trainingUsers = trainingUsers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TrainingDetail getTrainingDetail() {
		return trainingDetail;
	}

	public void setTrainingDetail(TrainingDetail trainingDetail) {
		this.trainingDetail = trainingDetail;
	}

	public List<TrainingUser> getTrainingUsers() {
		return trainingUsers;
	}

	public void setTrainingUsers(List<TrainingUser> trainingUsers) {
		this.trainingUsers = trainingUsers;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", description=" + description + ", trainingDetail="
				+ trainingDetail + ", trainingUsers=" + trainingUsers + "]";
	}
	
	

	
}
