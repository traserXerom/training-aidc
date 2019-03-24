package com.anabatic.training.users.persistence.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.anabatic.generic.persistence.model.TypicalGenericModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="training_role")
public class Role extends TypicalGenericModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="role_id")
	private Long id;
	
	@Column(name="role_name")
	private String name;
	
	@OneToMany(mappedBy="role", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JsonIgnore
	private List<User> users;

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", getClientId()=" + getClientId() + ", getCreatedTime()="
				+ getCreatedTime() + ", getCreatedBy()=" + getCreatedBy() + ", getUpdatedTime()=" + getUpdatedTime()
				+ ", getUpdatedBy()=" + getUpdatedBy() + ", getAuthoriser()=" + getAuthoriser()
				+ ", getAuthorizeTime()=" + getAuthorizeTime() + ", getVersion()=" + getVersion() + ", getStatus()="
				+ getStatus() + "]";
	}

	public Role(String name) {
		super();
		this.name = name;
		
		this.setClientId("1");
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


	
	
	
}
