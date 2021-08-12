package com.Docker.DockerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/greeting")
	public String greeting() {
		return "Welcome to my youtube channel";
	}

}
