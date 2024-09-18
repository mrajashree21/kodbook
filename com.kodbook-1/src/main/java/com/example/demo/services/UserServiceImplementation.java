package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	UserRepository repo ;

	@Override
	public Boolean userExists(String username, String email) {
		// TODO Auto-generated method stub
		if(repo.findByUsername(username)==null && repo.findByEmail(email)==null)
		{
			return false;
		}
		
		return true;
	
			
		
		
		
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public Boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		String dbpass=repo.findByUsername(username).getPassword();
		if(password.equals(dbpass))
		{
			return true;
		}
		return false;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		
		return repo.findByUsername(username);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	

}
