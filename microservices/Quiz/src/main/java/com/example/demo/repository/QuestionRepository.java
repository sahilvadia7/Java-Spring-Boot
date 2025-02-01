package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	public List<Question> findByCategory(String category);
}
