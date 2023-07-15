package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.service.UserService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("getUser")
	public ResponseEntity<Users> getUser(@RequestBody Users user) throws Exception{
		return ResponseEntity.ok(service.getUser(user) );
	}

	@PostMapping("addUser")
	public boolean addUser(@RequestBody Users user) throws Exception{
		return service.addUser(user);
	}
	
	@DeleteMapping("deleteUser/{userName}")
	public void removeUser(@PathVariable String userName) throws Exception{
		service.removeUser(userName);
	}
	
	@GetMapping("checkUser")
	public ResponseEntity<Boolean> checkUser(@RequestBody Users user) throws Exception{
		return ResponseEntity.ok(service.checkUser(user));
	}
	
}
