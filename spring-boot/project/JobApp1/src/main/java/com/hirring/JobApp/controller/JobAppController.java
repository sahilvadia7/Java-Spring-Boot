package com.hirring.JobApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hirring.JobApp.model.JobPost;
import com.hirring.JobApp.service.JobService;


@Controller
public class JobAppController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping({"/","/home"})
	public String home() {
		return "home";
	}
	
	@GetMapping("/viewalljobs")
	public String viewjobs(Model model) {
		List<JobPost> posts = jobService.allPost();
		model.addAttribute("jobPosts", posts);
		return "viewalljobs";
	}
	
	@RequestMapping("/addjob")
	public String addjob() {
		return "addjob";
	}
	
	@PostMapping("/handleForm")
	public String handleform(JobPost jp) {
		jobService.singlePost(jp);
		return "success";
	}

}
