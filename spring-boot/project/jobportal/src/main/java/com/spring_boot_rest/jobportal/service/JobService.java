package com.spring_boot_rest.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_rest.jobportal.model.JobPost;
import com.spring_boot_rest.jobportal.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo repo; 

	
	public List<JobPost> getAllJob(){
		return repo.getAllJobs();
	}
	
	public void addJob(JobPost post) {
		repo.addJob(post);
		
	}

	public JobPost getpost(int id) {
		return repo.getPost(id);
	}

	public void updatePost(JobPost post) {
		repo.updateJob(post);		
	}

	public void deletePost(int id) {
		repo.deletePost(id);
	}
}
