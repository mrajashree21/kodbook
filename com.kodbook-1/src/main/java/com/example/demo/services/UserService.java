package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;

public interface UserService {

	Boolean userExists(String username, String email);

	void addUser(User user);

	

	Boolean validateUser(String username, String password);
	
	User getUser(String username);
	
	void updateUser(User user);

	
	
	

}
