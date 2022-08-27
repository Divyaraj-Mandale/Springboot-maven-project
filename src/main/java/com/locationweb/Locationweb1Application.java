package com.locationweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb.dto.LocationData;
import com.locationweb.entities.Locations;
import com.locationweb.services.LocationService;

@SpringBootApplication
@Controller
public class Locationweb1Application {


	@Autowired
	private LocationService locationService;
	
	@Autowired
	private EmailService emailService;
	
	//handler method
	
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
