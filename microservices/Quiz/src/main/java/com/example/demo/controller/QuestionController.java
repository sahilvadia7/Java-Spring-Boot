package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	private QuestionService quesServie;
	
	
	@GetMapping("/getAll")
	public List<Question> getAll() {
		return quesServie.getAll();
	}
	
	@PostMapping("/addQue")
	public Question add(@RequestBody Question ques) {
		return quesServie.addQues(ques);
	}
	
	@GetMapping("/byCategory/{category}")
	public List<Question> getByCategory(@PathVariable String category) {
		return quesServie.getByCategory(category);
	}
	
}
