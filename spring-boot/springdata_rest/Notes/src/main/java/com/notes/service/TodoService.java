package com.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.model.Todo;
import com.notes.repository.TodoRepository;



@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepo;
	
	public Todo AddNotes(Todo notes) {
		return todoRepo.save(notes);
	}
	
	public List<Todo> getAllNotes() {
		return todoRepo.findAll();
	}
	
	public void delNoteById(Long id) {
		todoRepo.deleteById(id);
	}
	
}
