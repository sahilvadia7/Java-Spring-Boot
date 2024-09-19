package com.school;

import java.util.Scanner;

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
		Scanner se = new Scanner(System.in);
		
		
		System.out.print("Enter RollNo: ");
		s1.setRollno(se.nextInt());
		
		System.out.print("Enter Name: ");
		s1.setName(se.next());
		
		System.out.print("Enter Marks: ");
		s1.setMarks(se.nextInt());
		
		StudentService ss = context.getBean(StudentService.class);
		ss.addStudent(s1);
		
		ss.getAllStudent().forEach(n -> System.out.println(n.getRollno()+" "+n.getName()+" "+n.getMarks()));
		}

}
