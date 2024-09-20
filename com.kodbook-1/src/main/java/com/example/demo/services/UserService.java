package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;

public interface UserService {

	void addUser(User user);

	boolean userExists(String username, String email);

	boolean validateUser(String username, String password);

	User getUser(String username);

	void updateUser(User user);

	

}