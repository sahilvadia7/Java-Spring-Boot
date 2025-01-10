package com.springaop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springaop.model.Car;
import com.springaop.service.CarService;


@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@PostMapping("/add-car")
	public Car addCar(@RequestBody Car car) {
		return carService.addCar(car);
	}
	
	@GetMapping("/get-allCar")
	public List<Car> getAll(){
		return carService.getAllCar();
	}
	
	@GetMapping("/get-carById/{id}")
	public Car getCarById(@PathVariable Long id) {
		return carService.getCarById(id);
	}
}
