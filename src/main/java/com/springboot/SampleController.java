package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String hello() throws InterruptedException {
		return "hello";
	}

	@GetMapping("/world")
	public String world() throws InterruptedException {
		return "world";
	}
}
