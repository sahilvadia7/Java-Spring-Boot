package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.models.Classs;

@Repository
public interface ClassRepository extends JpaRepository<Classs, Long>{

}
