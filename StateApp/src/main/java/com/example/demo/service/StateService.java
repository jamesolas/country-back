package com.example.demo.service;

import java.util.List;

import com.example.demo.model.States;

public interface StateService {
	
	public List<States> findAllStates() throws Exception;
	
	public States findByName(String id) throws Exception;
	

}
