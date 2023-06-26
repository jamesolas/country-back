package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.States;
import com.example.demo.repository.StateRepository;

@Service
@Transactional
public class StateServiceImpl implements StateService {

	@Autowired
	StateRepository repo;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<States> findAllStates() throws Exception {
		List<States> list = repo.findAll();
		log.info(list.toString());
		if(list.isEmpty()) {
			throw new Exception("List is empty.");
		}
		return list;
	}

	@Override
	public States findByName(String id) throws Exception {
		Optional<States> optional =  repo.findById(id);
		States state = optional.orElseThrow(()->new Exception("State not found."));
		return state;
	}


}
