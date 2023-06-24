package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AnimalService;


@CrossOrigin
@RestController
public class AnimalController {
	
	@Autowired
	AnimalService service;
	
	@GetMapping("getAnimalName/{stateName}")
	public ResponseEntity<String> getAnimalName(@PathVariable String stateName) throws Exception {
		 return ResponseEntity.ok(service.findByStateName(stateName));
	}
	
	@GetMapping("getAnimalNames/{stateName}")
	public ResponseEntity<String[]> findAllByStateName(@PathVariable String stateName) throws Exception {
		 return ResponseEntity.ok(service.findAllByStateName(stateName));
	}
	
	
}
