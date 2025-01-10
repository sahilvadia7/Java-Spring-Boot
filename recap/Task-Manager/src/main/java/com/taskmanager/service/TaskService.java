package com.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;
	
	public Task addTask(Task task) {
		return taskRepo.save(task);
	}
	
	public List<Task> allTask(){
		return taskRepo.findAll();
	}
}
