package com.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.models.Users;
import com.school.service.UserService;

@RestController
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add-user")
	public Users addUser(@RequestBody Users user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/get-allUser")
	public List<Users> getAllUser(){
		return userService.getAllUser();
	}
}
