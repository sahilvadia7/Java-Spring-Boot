package com.example.springsecond;

import org.springframework.context.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springsecond.config.AppConfig;

@SpringBootApplication
public class SpringBootJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService ss = context.getBean(StudentService.class);

		// Create and add students dynamically
        Student s1 = ss.createStudent(1, "Sahil", 60);
        Student s2 = ss.createStudent(2, "Nikhil", 80);
        Student s3 = ss.createStudent(3, "Aryan", 90);
        
        ss.addStudent(s1);
        ss.addStudent(s2);
        ss.addStudent(s3);
        
		ss.getAllStudent().forEach(n -> System.out.println(n.getId() +" "+n.getName() +" "+n.getMarks()));
		System.out.println("\nStudentById: "+ss.getStudentById(3).getName());
		
	}

}
