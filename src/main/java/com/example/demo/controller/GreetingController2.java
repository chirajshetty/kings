package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController2 {

	@GetMapping("/greetings")
	public String greetings(@RequestParam(required = false, defaultValue = "World") String name) {
		return "greetings " + name;
	}

}