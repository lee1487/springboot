package com.springboot;

import java.time.Period;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${timeToFry}")
	private Period timeToFry;

	@GetMapping("/hello")
	public String hello() {
		return "chicken " + timeToFry;
	}
}
