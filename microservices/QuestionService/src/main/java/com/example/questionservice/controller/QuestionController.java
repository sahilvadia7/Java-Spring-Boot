package com.example.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.questionservice.model.Question;
import com.example.questionservice.model.QuestionWrapper;
import com.example.questionservice.model.Response;
import com.example.questionservice.service.QuestionService;

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
	
	//Generate Question for Quiz
	@GetMapping("/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName,@RequestParam Integer numQuestions){
		return quesService.getQuestionsForQuiz(categoryName,numQuestions);
		
	}
	
	@PostMapping("/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds) {
		return quesService.getQuestionFromId(questionIds);
	}
	
	@PostMapping("/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
		return quesService.getSocre(responses);
	}
	
}
