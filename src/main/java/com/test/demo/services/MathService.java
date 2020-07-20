package com.test.demo.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
}
