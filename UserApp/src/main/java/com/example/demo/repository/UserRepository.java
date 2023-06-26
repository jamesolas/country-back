package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Users;

public interface UserRepository extends JpaRepository<Users, String>{
	
	Optional<Users> findByUsername(String userName);

	Optional<Users> findByUsernameAndPassword(String userName, String password);

}
