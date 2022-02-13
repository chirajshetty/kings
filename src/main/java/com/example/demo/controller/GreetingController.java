package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.SudokuService;

@Controller
public class GreetingController {

	@Autowired
	private SudokuService sudokuService;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute(Messages.getString("GreetingController.0"), name); //$NON-NLS-1$
		model.addAttribute(Messages.getString("GreetingController.1"), sudokuService.solveSudoku()); //$NON-NLS-1$
		return Messages.getString("GreetingController.2"); //$NON-NLS-1$
	}

}