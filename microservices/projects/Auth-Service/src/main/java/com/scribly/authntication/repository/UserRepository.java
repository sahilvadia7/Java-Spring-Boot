package com.scribly.authntication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scribly.authntication.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUsername(String user);

}
