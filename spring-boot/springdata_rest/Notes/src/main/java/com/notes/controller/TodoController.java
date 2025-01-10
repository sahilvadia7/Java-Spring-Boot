package com.notes.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.model.Todo;
import com.notes.service.TodoService;



@RestController 
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/add-note")
    public ResponseEntity<?> addNote(@RequestBody Todo notes) {
        if (notes == null || notes.getData() == null || notes.getData().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Note content is empty"));
        }

        Todo savedNote = todoService.AddNotes(notes);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Note saved successfully!", "note", savedNote));
    }

    @GetMapping("/get-allnotes")
    public ResponseEntity<List<Todo>> getAllNotes() {
        List<Todo> notes = todoService.getAllNotes();
        return ResponseEntity.ok(notes);
    }
    
    @DeleteMapping("/del/{id}")
    public ResponseEntity<?> delNote(@PathVariable Long id){
    	if(id == null) {
    		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	}
    	todoService.delNoteById(id);
    	return new ResponseEntity<>("Note Deleted",HttpStatus.OK);
    }
    
    
}
