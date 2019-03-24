package com.anabatic.training.users.endpoint.param.contract;

import com.anabatic.generic.endpoint.contract.BaseTypicalRequest;
import com.anabatic.training.users.persistence.model.Role;

public class UserInsertRequest extends BaseTypicalRequest{
	private String name;
	private String pass;
	private Role role;
	
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
