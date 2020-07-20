package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.services.MathService;

@RestController
public class ArithmeticOperationController {
	
	@Autowired
	private MathService mathService;
	
	@RequestMapping("/add")
	public int add() {
		return mathService.add(10, 39); 
    }
	
	@RequestMapping("/multi")
	public int multiply() {
		return mathService.multiply(10, 39); 
  	}
	
	@RequestMapping("/div")
	public int divide() {
		return mathService.div(10, 5); 
  	}
	
	@RequestMapping("/subtract")
	public int subtract() {
		return mathService.subtract(10, 5); 
  	}

}
