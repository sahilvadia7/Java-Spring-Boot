package com.springaop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springaop.model.Car;
import com.springaop.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepo;

	public Car addCar(Car car) {
		return carRepo.save(car);
	}
	
	public List<Car> getAllCar(){
		return carRepo.findAll();
	}
	
	public Car getCarById(Long id) {
		return carRepo.findById(id).orElse(null);
	}
	
	
}
