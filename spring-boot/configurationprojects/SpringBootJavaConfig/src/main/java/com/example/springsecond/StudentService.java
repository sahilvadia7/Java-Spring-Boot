package com.example.springsecond;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;

@Service
public class StudentService {

	
	 @Autowired 	
	 private ApplicationContext context;
	
	List<Student> students = new ArrayList<>();
	
	//create student
	public Student createStudent(int id,String name,int marks) {
		
		Student student = context.getBean(Student.class);
		student.setId(id);
		student.setName(name);
		student.setMarks(marks);
		return student;
		
	}
	
	//add Student
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//get AllStudent
	public List<Student> getAllStudent(){
		return students;
	}
	
	//Find ById
	public Student getStudentById(Integer id) {
		return students.stream()
						.filter(student -> student.getId().equals(id))
						.findFirst()
						.orElse(null);
	}
	
	//remove ById	
	public void removeStudentById(Integer id) {
		students.removeIf(student -> student.getId().equals(id));
	}
	
}
