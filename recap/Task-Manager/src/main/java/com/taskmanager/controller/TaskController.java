package com.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@PostMapping("/addTask")
	public ResponseEntity<?> addTask(@RequestBody Task task){
		if(task.getName() != null) {
			return ResponseEntity.ok(taskService.addTask(task));
		}
		return ResponseEntity.ofNullable(taskService);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Task>> getAll(){
		return ResponseEntity.ok(taskService.allTask());
	}
}
