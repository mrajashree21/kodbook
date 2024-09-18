package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Post;
import com.example.demo.services.PostService;

@Controller
public class NavigationController {
	
	@Autowired
	PostService postService;
	
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
	public String profile(){
		return "profile";
	}
	
	@GetMapping("/editProfile")
	public String editProfile(){
		return "editProfile";
	}
	
	
	
	

}
