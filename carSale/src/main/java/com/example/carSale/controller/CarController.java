package com.example.carSale.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carSale.Service.CarService;
import com.example.carSale.entity.CarEntity;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	CarService carService;
	@GetMapping("/get-all")
	public List<CarEntity> findAllCars() {
		return carService.findAllCars();
	}
	@GetMapping("/{id}")
	public Optional<CarEntity> findCarById(@PathVariable Integer id) {
		return carService.findCarById(id);
	}
	@PostMapping("/add")
    public void saveCar(@RequestBody CarEntity carEntity) {
        carService.saveCar(carEntity);
    }
}