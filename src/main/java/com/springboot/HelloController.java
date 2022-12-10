package com.springboot;

import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	ApplicationAvailability availability;

	@GetMapping("/hello")
	public String hello() {

		return "Application is now " + availability.getLivenessState() + " " + availability.getReadinessState();
	}

	@GetMapping("/slow")
	public String slow() throws InterruptedException {
		Thread.sleep(5000L);
		return "slow";
	}
}
