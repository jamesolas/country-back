package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repository.AnimalRepository;
import com.example.demo.service.AnimalService;

@SpringBootApplication
public class AnimalAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AnimalAppApplication.class, args);
		
		
//		AnimalService service = new AnimalService();
//		
//		System.out.println(service.findByStateName("California"));
	}

}
