package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin
@RequestMapping("question")
public class QuestionController {

	@Autowired
	private QuestionService quesService;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Question>> getAll() {
		return quesService.getAll();
	} 
	
	@PostMapping("/addQue")
	public ResponseEntity<Question> add(@RequestBody Question ques) {
		return quesService.addQues(ques);
	}
	
	@PostMapping("/addMultiple")
	public ResponseEntity<List<Question>> addMultiple(@RequestBody List<Question> ques){
		return quesService.addMultiple(ques);
	}
	
	@GetMapping("/byCategory/{category}")
	public ResponseEntity<List<Question>> getByCategory(@PathVariable String category) {
		return quesService.getByCategory(category);
	} 
	
	@GetMapping("/byDifficultylevel/{level}")
	public ResponseEntity<List<Question>> getByDiffLevel(@PathVariable String level) {
		return quesService.getByDiffLevel(level);
	} 
	
}
