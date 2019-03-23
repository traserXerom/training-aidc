package com.anabatic.training.users.endpoint.param.contract;

import com.anabatic.generic.endpoint.contract.BaseTypicalRequest;

public class UserRequest extends BaseTypicalRequest{
	private Long id;
	private String name;
	private String pass;
	private Long role_id;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
	
}
