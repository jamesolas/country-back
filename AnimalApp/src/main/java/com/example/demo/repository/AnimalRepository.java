package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Animals;

public interface AnimalRepository extends JpaRepository<Animals, String>{
	
//	Optional<Animals> findByStateName(String stateName);
	
	Optional<Animals[]> findByStateName(String stateName);

}
