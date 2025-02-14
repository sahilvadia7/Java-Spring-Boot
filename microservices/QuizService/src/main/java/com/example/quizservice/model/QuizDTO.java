package com.example.quizservice.model;

import lombok.Data;

@Data
public class QuizDTO {

	String category;
	int numQues;
	String title;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNumQues() {
		return numQues;
	}
	public void setNumQues(int numQues) {
		this.numQues = numQues;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
