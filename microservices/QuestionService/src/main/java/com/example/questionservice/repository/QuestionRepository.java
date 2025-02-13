package com.example.questionservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.questionservice.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	List<Question> findByCategory(String category);
	List<Question> findByDifficultylevel(String level);
	 
	@Query(value = "SELECT q.id FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQues",nativeQuery = true) 
	List<Integer> findRandomQuestionByCategory(String category, int numQues);
}
