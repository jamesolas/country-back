package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.States;
import com.example.demo.service.StateService;
@CrossOrigin
@RestController
public class StateController {
	
	@Autowired
	StateService stateService;
	
	@GetMapping("getStates")
	ResponseEntity<List<States>> getStates() throws Exception{
		return ResponseEntity.ok(stateService.findAllStates());
	}
	
	@GetMapping("getState/{id}")
	ResponseEntity<States> getState(@PathVariable String id) throws Exception{
		return new ResponseEntity<>(stateService.findByName(id), HttpStatus.OK);
	}
	
	

}
