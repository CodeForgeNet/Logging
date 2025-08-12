package com.cfn.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping
	public String home() {
		
		System.out.println("api calling : home");
		return "This is home api";
	}
	
}
