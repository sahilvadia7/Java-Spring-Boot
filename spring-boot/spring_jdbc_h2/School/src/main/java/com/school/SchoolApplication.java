package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import com.school.model.Student;
import com.school.service.StudentService;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SchoolApplication.class, args);
		
		Student s1 = context.getBean(Student.class);
		s1.setRollno(6);
		s1.setName("tanvi");
		s1.setMarks(100);
		
		StudentService ss = context.getBean(StudentService.class);
		ss.addStudent(s1);
		
		ss.getAllStudent().forEach(n -> System.out.println(n.getRollno()+" "+n.getName()+" "+n.getMarks()));
		}

}
