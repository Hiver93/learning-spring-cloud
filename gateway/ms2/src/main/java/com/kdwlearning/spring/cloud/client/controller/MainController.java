package com.kdwlearning.spring.cloud.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ms1")
public class MainController {
	@GetMapping("/main")
	public String mainP() {
		return "main";
	}
}
