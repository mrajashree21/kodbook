package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;
import com.example.demo.services.PostService;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class NavigationController {
	
	@Autowired
	PostService postService;
	
	@Autowired
	UserService service;
	
	
	@GetMapping("/")
	public String index(){
		return "index";
	}
	

	@GetMapping("/openSignUp")
	public String openSignUp(){
		return "signUp";
	}
	
	@GetMapping("/createPost")
	public String createPost(){
		return "createPost";
	}
	
	@GetMapping("/goHome")
	public String login(Model model)	{
			List<Post> allPosts = postService.fetchAllPosts();
			model.addAttribute("allPosts", allPosts);
			return "home";
	}
	
	@GetMapping("/profile")
	public String profile(Model model, HttpSession session){
		String username = (String) session.getAttribute("username");
		User user = service.getUser(username);
		model.addAttribute("user", user);
		return "profile";
	}
	
	@GetMapping("/editProfile")
	public String editProfile(){
		return "editProfile";
	}
	
	
	
	

}
