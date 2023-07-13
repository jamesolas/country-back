package com.example.demo.service;

import com.example.demo.models.Users;

public interface UserService {
	
	boolean addUser(Users user) throws Exception;
	
	void removeUser(String userName) throws Exception;
	
	Users getUser(Users user) throws Exception;
	
	boolean checkUserPass(Users user) throws Exception;
	
	boolean checkUser(Users user) throws Exception;
	
	boolean userExists(String userName) throws Exception;

}
