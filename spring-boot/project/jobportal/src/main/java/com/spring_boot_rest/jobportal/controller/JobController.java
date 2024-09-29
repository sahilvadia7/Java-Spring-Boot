package com.spring_boot_rest.jobportal.controller;

import java.util.List;

import javax.print.attribute.standard.JobStateReason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_rest.jobportal.model.JobPost;
import com.spring_boot_rest.jobportal.service.JobService;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobservice;
	
	
	@GetMapping("/jobPosts")
	public List<JobPost> getAllJob(){	
		return jobservice.getAllJob();
	}
	
	@PostMapping("/jobPost")
	public JobPost addJob(@RequestBody JobPost post) {
		jobservice.addJob(post);
		
		// return what we add
		return jobservice.getpost(post.getPostId());
	}
	
	
	@GetMapping("/jobPost/{id}")
	public JobPost getJob(@PathVariable int id) {
		return jobservice.getpost(id);
	}
	
	
	@PutMapping("/jobPost")
	public JobPost updateJob(@RequestBody JobPost post) {
		jobservice.updatePost(post);
		return jobservice.getpost(post.getPostId());
	}
	
	@DeleteMapping("/jobPost/{id}")
	public void deleteJob(@PathVariable int id) {
		jobservice.deletePost(id); 
	}
	

}
