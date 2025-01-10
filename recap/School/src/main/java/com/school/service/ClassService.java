package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.school.models.Classs;
import com.school.repository.ClassRepository;

@Service
public class ClassService {

	@Autowired
	private ClassRepository classRepository;
	
	public Classs addNewClass(Classs classroom) {
		return classRepository.save(classroom);
	}
	
	public List<Classs> getAllClass(){
		return classRepository.findAll();
	}
}
