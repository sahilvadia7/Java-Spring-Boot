package com.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.notes.model.User;
import com.notes.model.UserPrincipal;
import com.notes.repository.UserRepositoy;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepositoy userRepo;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public User addUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
//		System.out.println(user.getPassword());
		return userRepo.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	public User userFindById(Long id) {
		return userRepo.findById(id).orElse(null);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		if(user == null) {
			System.out.println("User Null");
			throw new UsernameNotFoundException(username);
		}
		return new UserPrincipal(user);
	}
	

}
