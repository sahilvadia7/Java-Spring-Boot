package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.models.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}
	
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).orElseThrow(() -> new RuntimeException());
	}
	
	public String deleteStudent(Long id) {
		 studentRepo.deleteById(id);
		 return "Student deleted!";
	}
}
