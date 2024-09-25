package com.hirring.JobApp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hirring.JobApp.model.JobPost;

@Repository
public class JobRepo {

	
	List<JobPost> jobs = new ArrayList<>();
	
	public JobRepo() {
		// Java Developer Job Post
				jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
						List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

				// Frontend Developer Job Post
				jobs.add(
						new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
								3, List.of("HTML", "CSS", "JavaScript", "React")));

				// Data Scientist Job Post
				jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
						List.of("Python", "Machine Learning", "Data Analysis")));

				// Network Engineer Job Post
				jobs.add(new JobPost(4, "Network Engineer",
						"Design and implement computer networks for efficient data communication", 5,
						List.of("Networking","Switching")));

			
				

	}
	
	public List<JobPost> allPost(){
		return jobs;
	}
	
	public void singlepost(JobPost jp) {
		jobs.add(jp);
	}
}
