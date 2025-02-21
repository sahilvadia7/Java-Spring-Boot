package com.scribly.authntication.controller;

import org.springframework.web.bind.annotation.RestController;

import com.scribly.authntication.model.User;
import com.scribly.authntication.service.UserService;
import com.scribly.authntication.service.JWTService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("auth")
@CrossOrigin("http://localhost:3000/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JWTService jwtservice;
	
	@PostMapping("/register")
	public ResponseEntity<String> postMethodName(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
//	@PostMapping("/login")
//	public String Login(@RequestBody User user) {
//		
//		Authentication authentication = authenticationManager
//				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
//		
//		if(authentication.isAuthenticated()) {
//			System.out.println("authenticated");
//			return jwtservice.getToken(user.getUsername());
//		}
//		else {
//			return "login failed";
//		}
//	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> Login(@RequestBody User user) {
	    Authentication authentication = authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
	    );

	    if (authentication.isAuthenticated()) {
	        String token = jwtservice.getToken(user.getUsername());
	        Map<String, String> response = new HashMap<>();
	        response.put("token", token);
	        response.put("username", user.getUsername());
	        return ResponseEntity.ok(response);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "Login failed"));
	    }
	}

	@GetMapping("greet")
	public ResponseEntity<String> Greet() {
		return new ResponseEntity<String>("Welcome back",HttpStatus.ACCEPTED);
	}
	
	
	
}
