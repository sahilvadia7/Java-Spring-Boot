package com.spring_jpa.school;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring_jpa.school.model.Student;
import com.spring_jpa.school.repo.StudentRepo;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SchoolApplication.class, args);
		
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		add into database
		
//		s1.setRollno(1);
//		s1.setName("sahil");
//		s1.setMarks(55);
//		repo.save(s1);
//
//		s2.setRollno(2);
//		s2.setName("Nikhil");
//		s2.setMarks(85);
//		repo.save(s2);
//
//		s3.setRollno(3);
//		s3.setName("Aryan");
//		s3.setMarks(95);
//		repo.save(s3);
		
		
//		fetch all
//		System.out.println(repo.findAll());
		
//		fetch by id {byDefalut use Optional}
//		System.out.println(repo.findById(2));
		
//		Optional if data null
//		Optional<Student> s= repo.findById(4);
//		System.out.println(s.orElse(new Student()));
//		
		
//		findByName
//		System.out.println("FindByName");
//		System.out.println(repo.findByName("Aryan"));
		
		
//		update data
		s2.setRollno(2);
		s2.setName("Nikhil Rathod");
		s2.setMarks(85);
//		repo.save(s2);	
//		
		
//		delete data
		repo.delete(s2);
	}

}
