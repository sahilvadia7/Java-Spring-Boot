package com.springaop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springaop.model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}
