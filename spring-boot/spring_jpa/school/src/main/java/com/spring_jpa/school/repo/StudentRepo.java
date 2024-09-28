package com.spring_jpa.school.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring_jpa.school.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

//	@Query("select s from Student s where s.name = ?1") 
//	if byDefalut not have method you need to write Query
	List<Student> findByName(String name);
}
