package com.example.sampleapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/api/home")
	public ResponseEntity<?> getMap()
	{
		return new ResponseEntity<>("Welcome to spring boot app",HttpStatus.OK);
	}

}
