package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
