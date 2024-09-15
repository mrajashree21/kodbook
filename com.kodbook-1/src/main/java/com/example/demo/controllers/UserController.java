package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user)
	{
		String username=user.getUsername();
		String email=user.getEmail();
		Boolean status=service.userExists(username,email);
		if(status==false)
		{
			service.addUser(user);
		}
		
		// User already exists, show an error message
        
        return "signup";  // Redirect to the signup page with e
	
	

		
		
	}
	
	

	@PostMapping("/login")
	public String validateUser(@RequestParam String username,@RequestParam String password)
	{
		
		Boolean status=service.validateUser(username,password);
		if(status==true)
		{
			return "home";
		}
		else
		{
			return "index";
		}
		
		
	}
	
	
	

}
