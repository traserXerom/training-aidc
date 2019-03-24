package com.anabatic.training.users.persistence.model;

import javax.persistence.CascadeType;
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
public class User extends TypicalGenericModel
{
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long id;
		
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_password")
	private String password;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="role_id", referencedColumnName="role_id")
	@JsonIgnore
	private Role role;
	
	public User() {
		super();
	}

	public User(String name, String password, Role role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
		
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

	
	
}
