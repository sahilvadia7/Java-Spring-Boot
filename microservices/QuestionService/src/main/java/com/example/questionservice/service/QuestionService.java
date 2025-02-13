package com.example.questionservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.questionservice.model.Question;
import com.example.questionservice.model.QuestionWrapper;
import com.example.questionservice.model.Response;
import com.example.questionservice.repository.QuestionRepository;

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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {

		List<Integer> questions = quesRepo.findRandomQuestionByCategory(categoryName,numQuestions);
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(List<Integer> questionIds) {
		List<QuestionWrapper> wrappers = new ArrayList<>();
		List<Question> questions = new ArrayList<>();
		
		
		for(Integer id: questionIds) {
			questions.add(quesRepo.findById(id).get());
			
		}
		
		
		for(Question question: questions) {
			QuestionWrapper qw = new QuestionWrapper(question.getId(), question.getQuestionTitle(), question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4());
			wrappers.add(qw);
		}
		
		return new ResponseEntity<>(wrappers,HttpStatus.OK);
	}

	public ResponseEntity<Integer> getSocre(List<Response> responses) {

		int right = 0;
		for(Response response : responses) {
			
			Question question = quesRepo.findById(response.getId()).get();
			if(response.getResponse().equals(question.getRightAnswer()));
			
			right++;
		}
		
		return new ResponseEntity<>(right,HttpStatus.OK);
	}
}
