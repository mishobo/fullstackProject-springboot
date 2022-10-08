package com.husseinabdallah287.fullstackbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.husseinabdallah287.fullstackbackend.exceptions.UserNotFoundException;
import com.husseinabdallah287.fullstackbackend.model.User;
import com.husseinabdallah287.fullstackbackend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;


	@PostMapping("/addUser")
	 User saveUser (@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@GetMapping("/getAllUsers")
	List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/ueer/{id}")
	User getUserById(@PathVariable Long id) {
		return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
	}
	
	
}
