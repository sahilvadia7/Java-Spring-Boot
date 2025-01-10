package com.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.notes.model.User;

public interface UserRepositoy extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
