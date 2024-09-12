package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Student;
import com.school.repository.StudentRepo;

@Service
public class StudentService{
	
	private StudentRepo repo;
	
	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student student) {
		repo.save(student);
	}
	
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
}
