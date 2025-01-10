package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.school.models.Users;
import com.school.principal.UserDetailsPrincipal;
import com.school.repository.UserRespository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRespository userRepo;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	
	public Users addUser(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return userRepo.save(user);
	}
	
	public List<Users> getAllUser(){
		return userRepo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByUsername(username);
		if(user == null) {
			System.out.println("User Null");
			throw new UsernameNotFoundException(username);
		}
		return new UserDetailsPrincipal(user);
	}

}
