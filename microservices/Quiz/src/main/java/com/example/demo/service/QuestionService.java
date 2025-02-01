package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuestionService {

	
	@Autowired
	private QuestionRepository quesRepo;
	
	public List<Question> getAll(){
		return quesRepo.findAll();
	}
	
	public Question addQues(Question ques) {
		return quesRepo.save(ques);
	}
	
	public List<Question> getByCategory(String category) {
		return quesRepo.findByCategory(category);
	}
}
