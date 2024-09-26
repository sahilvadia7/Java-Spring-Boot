package com.spring_boot_rest.jobportal.repo;


import org.springframework.stereotype.Repository;
import com.spring_boot_rest.jobportal.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>{

	public List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}