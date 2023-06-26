package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Users;
import com.example.demo.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public boolean addUser(Users user) throws Exception {
		if(checkUser(user) == true) {
			return false;
		}
		repo.save(user);
		return true;
	}

	@Override
	public void removeUser(String userName) throws Exception {
		repo.deleteById(userName);
	}

	@Override
	public Users getUser(Users user) throws Exception {
		Optional<Users> optional = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		Users returnedUser = optional.orElseThrow( ()-> new Exception("Username/password is incorrect.") );
		if(returnedUser == user) {
			return returnedUser;
		}
		return null;
	}

	@Override
	public boolean checkUserPass(Users user) throws Exception {
		Optional<Users> optional = repo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		Users returnedUsers = optional.orElseThrow( ()-> new Exception("Username/password is incorrect"));
		return returnedUsers == user;
	}
	
	@Override
	public boolean checkUser(Users user) throws Exception {
		Optional<Users> optional = repo.findByUsername(user.getUsername());
		Users returnedUsers = optional.orElseThrow( ()-> new Exception("Username/password is incorrect"));
		return returnedUsers == user;
	}

}
