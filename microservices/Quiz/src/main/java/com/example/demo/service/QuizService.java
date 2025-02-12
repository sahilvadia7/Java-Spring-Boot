package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionWrapper;
import com.example.demo.model.Quiz;
import com.example.demo.model.Response;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepo;
	
	@Autowired
	private QuestionRepository questionRepo;

	
	public ResponseEntity<String> createQuiz(String category, int numQues, String title) {

		List<Question> questions = questionRepo.findRandomQuestionByCategory(category,numQues);

		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizRepo.save(quiz);
		
		try {
		return new ResponseEntity<>("Sucess",HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("failed",HttpStatus.BAD_REQUEST);
	}


	public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id) {
		
		Optional<Quiz> quiz = quizRepo.findById(id);
		List<Question> questionFormDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionForUser = new ArrayList<>();
		
		for(Question q : questionFormDB) {
			QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
			questionForUser.add(qw);
		}
		
		return new ResponseEntity<>(questionForUser,HttpStatus.OK);
	}


	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		Optional<Quiz> quiz = quizRepo.findById(id);
		List<Question> questions = quiz.get().getQuestions();
		
//
//		for(Question q : questions) {
//			System.out.println(q.getQuestionTitle()+" ->"+q.getRightAnswer());
//		}
		
		int right = 0;
		int i = 0;
		for(Response response : responses) {
			if(response.getResponse().equals(questions.get(i).getRightAnswer()))
				right++;
		i++;
		
		}
		
		return new ResponseEntity<>(right,HttpStatus.OK);

	}
	
	
	
}
