package com.example.demo.models;

import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table
public class Users {
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String email;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userName, String passWord, String email) {
		super();
		this.username = userName;
		this.password = passWord;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passWord) {
		this.password = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Users [userName=" + username + ", passWord=" + password + ", email=" + email + "]";
	}
	
	

}
