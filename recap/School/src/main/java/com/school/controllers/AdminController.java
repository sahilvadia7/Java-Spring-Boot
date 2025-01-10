package com.school.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.models.Classs;
import com.school.models.Student;
import com.school.models.Teacher;
import com.school.service.ClassService;
import com.school.service.StudentService;
import com.school.service.TeacherService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private ClassService classService;
	
	
	
	
	
//	Student Mapping
	
	@PostMapping("/add-student")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		
		if(student != null) {
			return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Value not be Null",HttpStatus.BAD_REQUEST);
	}
	
	// sending csrf token	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@GetMapping("/get-allStudent")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/get-studentById/{key}")
	public Student getStudentById(@PathVariable("key") Long id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/del-student/{key}")
	public String deleteStudent(@PathVariable("key") Long id) {
		return studentService.deleteStudent(id);
	}

	
//	ClassRoom Mapping
	
	@PostMapping("/add-classroom")
	public Classs addClassRoom(@RequestBody Classs classroom) {
		return classService.addNewClass(classroom);
	}
	
	@GetMapping("get-classRoom")
	public List<Classs> getAllClass(){
		return classService.getAllClass();
	}
	
	
	
	
// Teacher Mapping
	
	@PostMapping("/add-teacher")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@GetMapping("/get-allTeacher")
	public List<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	
	
	
	
}
