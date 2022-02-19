package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Resume;
import com.example.demo.services.ResumeService;

@RestController
public class GreetingController2 {
	
	@Autowired
	private ResumeService resumeService;

	@GetMapping("/greetings")
	public String greetings(@RequestParam(required = false, defaultValue = "World") String name) {
		return "greetings " + name;
	}

	@GetMapping("/resume")
	public Resume resume() {
		resumeService.setDummyDetails();
		return resumeService.getDetails();
	}

}