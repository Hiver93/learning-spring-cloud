package com.kdw.learning.spring.cloud.eureka.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/main")
	public String mainP() {
		return "main";
	}
}
