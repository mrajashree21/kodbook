package com.example.demo.services;

import com.example.demo.entities.User;

public interface UserService {

	Boolean userExists(String username, String email);

	void addUser(User user);

	

	Boolean validateUser(String username, String password);
	
	

}
