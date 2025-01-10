package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatarest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
