package com.spring_boot_rest.jobportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_rest.jobportal.model.JobPost;
import com.spring_boot_rest.jobportal.repo.JobRepo;

@Service
public class JobService {	
	
	@Autowired
	private JobRepo repo; 
		
	
	public void loadData() {
		List<JobPost> jobs = new ArrayList<>();

		jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

		// Frontend Developer Job Post
		jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",3, List.of("HTML", "CSS", "JavaScript", "React")));

		// Data Scientist Job Post
		jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,List.of("Python", "Machine Learning", "Data Analysis")));

		// Network Engineer Job Post
		jobs.add(new JobPost(4, "Network Engineer","Design and implement computer networks for efficient data communication", 5,List.of("Networking","Switching")));
		
		repo.saveAll(jobs);
	}
	
	public List<JobPost> getAllJob(){
		return repo.findAll();
	}
	
	public void addJob(JobPost post) {
		repo.save(post);
		
	}

	public JobPost getpost(int id) {
		return repo.findById(id).orElse(new JobPost());
	}

	public void updatePost(JobPost post) {
		repo.save(post);		
	}

	public void deletePost(int id) {
		repo.deleteById(id);
	}

	public List<JobPost> search(String keyword) {
		return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}
}
