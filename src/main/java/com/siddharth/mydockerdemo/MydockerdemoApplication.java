package com.siddharth.mydockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydockerdemoApplication {

	@RequestMapping("/")
	public String home() {
		return "Welcome to Siddharth's docker demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(MydockerdemoApplication.class, args);
	}

}
