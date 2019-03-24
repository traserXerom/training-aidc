package com.anabatic.training.users.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.training.users.endpoint.converter.UserConverter;
import com.anabatic.training.users.endpoint.param.contract.UserGetByIdRequest;
import com.anabatic.training.users.endpoint.param.contract.UserInsertRequest;
import com.anabatic.training.users.persistence.dao.UserDao;
import com.anabatic.training.users.persistence.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao userDao;
	@Autowired
	private UserConverter userConverter;
	
	@PostMapping("")
	public ResponseEntity<BaseResponse> getAll(){
		List<User> users = userDao.getAll();
		
		BaseResponse response = new BaseResponse();
		response.setResponse(users);
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insert(@RequestBody UserInsertRequest userRequest){
		
		User user = userConverter.toModel(userRequest);
		user = userDao.save(user);
		
		BaseResponse response = new BaseResponse();
		response.setResponse(userConverter.toContract(user));
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/getbyid")
	public ResponseEntity<BaseResponse> getById(@RequestBody UserGetByIdRequest userGetByIdRequest){
		
		User user = userDao.get(userGetByIdRequest.getId());
		
		BaseResponse response = new BaseResponse();
		response.setResponse(userConverter.toContract(user));
		return ResponseEntity.ok().body(response);
	}
}
