package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.ResumeService;
import com.example.demo.services.SudokuService;

@Controller
public class GreetingController {
	
	@Autowired
	private ResumeService resumeService;

	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("resume", resumeService.getDetails());
		return "greeting";
	}
	
}