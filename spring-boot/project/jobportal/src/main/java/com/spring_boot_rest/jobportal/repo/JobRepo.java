package com.spring_boot_rest.jobportal.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring_boot_rest.jobportal.model.JobPost;

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
	public List<JobPost> getAllJobs(){
		return jobs;
	}
	
	public void addJob(JobPost post) {
		jobs.add(post);
		
	}
	
	public JobPost getPost(int id) {
		
		for(JobPost job : jobs) {
			if(job.getPostId() == id) {
				return job;
			}
			
		}
		return null;
	}
	
	public void updateJob(JobPost Upost) {
		
		for(JobPost jobpost : jobs) {
			if(jobpost.getPostId() == Upost.getPostId()) {
				jobpost.setPostId(Upost.getPostId());
				jobpost.setPostProfile(Upost.getPostProfile());
				jobpost.setPostDesc(Upost.getPostDesc());
				jobpost.setReqExperience(Upost.getReqExperience());
				jobpost.setPostTechStack(Upost.getPostTechStack());
				
			}
		}
	}
	public void deletePost(int id) {
		for(JobPost jobpost : jobs) {
			if(jobpost.getPostId() == id) {
					jobs.remove(jobpost);
				}
			}
	}

}