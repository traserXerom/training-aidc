package com.anabatic.training.users.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.training.users.endpoint.converter.RoleConverter;
import com.anabatic.training.users.endpoint.param.contract.RoleRequest;
import com.anabatic.training.users.persistence.dao.RoleDao;
import com.anabatic.training.users.persistence.model.Role;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private RoleConverter roleConverter;
	
	
	@PostMapping("")
	public ResponseEntity<BaseResponse> getAll(){
		List<Role> roles = roleDao.getAll();
		
		BaseResponse response = new BaseResponse();
		response.setResponse(roles);
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody RoleRequest roleRequest ){
		
		Role role = roleConverter.toModel(roleRequest);
		role = roleDao.save(role);
		
		BaseResponse response = new BaseResponse();
		response.setResponse(roleConverter.toContract(role));
		
		return ResponseEntity.ok().body(response);
	}
}
