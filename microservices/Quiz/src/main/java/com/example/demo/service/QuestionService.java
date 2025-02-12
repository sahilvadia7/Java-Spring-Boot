package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuestionService {

	
	@Autowired
	private QuestionRepository quesRepo;
	
	//getAll
	public ResponseEntity<List<Question>> getAll(){
		
		try {
		return new ResponseEntity<>(quesRepo.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	
	//addQues
	public ResponseEntity<Question> addQues(Question ques) {
		
		try {
		return new ResponseEntity<>(quesRepo.save(ques),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	//getByCategory
	public ResponseEntity<List<Question>> getByCategory(String category) {
		
		try {
		return new ResponseEntity<>(quesRepo.findByCategory(category),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	//addMultiple
	public ResponseEntity<List<Question>> addMultiple(List<Question> ques){
		try {
			return new ResponseEntity<>(quesRepo.saveAll(ques),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	//getByDiffLevel 
	public ResponseEntity<List<Question>> getByDiffLevel(String level) {
		
		try {
		return new ResponseEntity<>(quesRepo.findByDifficultylevel(level),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
}
