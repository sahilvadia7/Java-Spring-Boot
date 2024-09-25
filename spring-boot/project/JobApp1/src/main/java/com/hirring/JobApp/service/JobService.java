package com.hirring.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hirring.JobApp.model.JobPost;
import com.hirring.JobApp.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	public JobRepo jobrepo;
	

	public List<JobPost> allPost(){
		return jobrepo.allPost();
	}
	
	public void singlePost(JobPost jp) {
		jobrepo.singlepost(jp);
	}
}
