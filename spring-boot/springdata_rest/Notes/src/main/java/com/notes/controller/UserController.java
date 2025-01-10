package com.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.notes.model.User;
import com.notes.service.JwtService;
import com.notes.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;
	
	
	@PostMapping("/register")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PostMapping("/login")
	public String Login(@RequestBody User user) {
		 Authentication authentication = authenticationManager
				 .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		 
		 if(authentication.isAuthenticated()) {
			 return jwtService.getToken(user.getUsername());
		 }
		 return "Failed";
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getMethodName(@PathVariable Long id) {
		
		if(id == null) {
			return new ResponseEntity(id,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(service.userFindById(id),HttpStatus.ACCEPTED);
	}
	

}
