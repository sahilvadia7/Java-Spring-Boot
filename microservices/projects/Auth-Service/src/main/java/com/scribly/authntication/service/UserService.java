package com.scribly.authntication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.scribly.authntication.model.User;
import com.scribly.authntication.principal.UserPrincipal;
import com.scribly.authntication.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public ResponseEntity<String> registerUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepo.save(user);
		return new ResponseEntity<String>( "registerd",HttpStatus.CREATED);
	}
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	public User userFindById(Integer id) {
		return userRepo.findById(id).orElse(null);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new UserPrincipal(user);
	}

	public ResponseEntity<String> Greet(User user) {
		String greet = "Welcome Back"+user.getUsername();
		return new ResponseEntity<>(greet,HttpStatus.ACCEPTED);
	}
	

}
