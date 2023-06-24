package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Animals;
import com.example.demo.repository.AnimalRepository;

@Service
@Transactional
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalRepository repo;
	
	@Override
	public String findByStateName(String stateName) throws Exception {
//		Optional<Animals> optional = repo.findByStateName(stateName);
//		Animals animal = optional.orElseThrow(() -> new Exception("Animal not found with that state name."));
//		String animalName = animal.getAnimalName();
//		return animalName;
		return null;
	}

	@Override
	public String[] findAllByStateName(String stateName) throws Exception {
		Optional<Animals[]> optional = repo.findByStateName(stateName);
		Animals[] animals = optional.orElseThrow(() -> new Exception("Animals not found for this state."));
		String[] animalNames = new String[animals.length];
		for(int i = 0; i < animals.length; i++) {
			animalNames[i] = animals[i].getAnimalName();
		}
		return animalNames;
	}

}
