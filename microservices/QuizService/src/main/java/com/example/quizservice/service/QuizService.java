package com.example.quizservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizservice.feingn.QuizInterface;
import com.example.quizservice.model.QuestionWrapper;
import com.example.quizservice.model.Quiz;
import com.example.quizservice.model.Response;
import com.example.quizservice.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepo;
	
	@Autowired
	private QuizInterface quizInterface;
	
	public ResponseEntity<String> createQuiz(String category, int numQues, String title) {

		List<Integer> questions = quizInterface.getQuestionsForQuiz(category, numQues).getBody();
		
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionsIds(questions);
		quizRepo.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.OK);

	}


	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id) {
		
		Quiz quiz = quizRepo.findById(id).get();
		List<Integer> questionsIds = quiz.getQuestionsIds();
		ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionsIds);
		
		
		return questions; 
	}


	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {

		ResponseEntity<Integer> score = quizInterface.getScore(responses);
		return score;

	}
	
	
	
}
