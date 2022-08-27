package com.locationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class Locationweb1Application {


	
 	@RequestMapping("/show")
	public String showLocationPage() {
		return "create_location"; 
	}
	
	@GetMapping("/show")
	public String showLocation() {
		return "create_location"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(Locationweb1Application.class, args);
	}

}
