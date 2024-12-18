package com.kdw.learning.spring.cloud.config.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/hello")
	public String mainP() {
		return "main";
	}
}
