package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;

@Service
public class PostServiceImplementation implements PostService {
	
	@Autowired
	PostRepository repo;

	@Override
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
	}

}
