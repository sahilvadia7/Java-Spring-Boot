package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.models.Users;

@Repository
public interface UserRespository extends JpaRepository<Users, Long>{
	Users findByUsername(String username);
}
