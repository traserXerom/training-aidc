package com.anabatic.training.users.endpoint.param.contract;

import com.anabatic.generic.persistence.annotation.IsRequired;

public class UserInsertRequest {
	private String name;
	private String pass;
	@IsRequired
	private Long role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getRole() {
		return role;
	}
	public void setRole(Long role) {
		this.role = role;
	}
}
