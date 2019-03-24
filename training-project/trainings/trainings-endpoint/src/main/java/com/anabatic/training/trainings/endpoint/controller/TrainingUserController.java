package com.anabatic.training.trainings.endpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.training.trainings.endpoint.converter.TrainingUserConverter;
import com.anabatic.training.trainings.endpoint.param.contract.TrainingUserRequest;
import com.anabatic.training.trainings.persistence.model.TrainingUser;
import com.anabatic.training.trainings.service.TrainingUserService;

@RestController
@RequestMapping("/training-user")
public class TrainingUserController {
	
	@Autowired
	private TrainingUserConverter converter;
	
	@Autowired
	private TrainingUserService trainingUserService;

	@PostMapping("")
	public ResponseEntity<BaseResponse> getAll(){
		List<TrainingUser> trainingUsers = trainingUserService.getAll();
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContracts(trainingUsers));
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<BaseResponse> insertList(@RequestBody List<TrainingUserRequest> request){
		List<TrainingUser> trainingUsers = converter.toModels(request);
		
		for (TrainingUser trainingUser : trainingUsers) {
			trainingUser = trainingUserService.save(trainingUser);
		}
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContracts(trainingUsers));
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping("/getByTrainingId")
	public ResponseEntity<BaseResponse> getByTrainingId(@RequestBody TrainingUserRequest request){
		List<TrainingUser> trainingUsers = trainingUserService.getByTrainingId(request.getTrainingBean().getId());
		
		BaseResponse response = new BaseResponse();
		response.setResponse(converter.toContracts(trainingUsers));
		
		return ResponseEntity.ok().body(response);
	}
	
}
