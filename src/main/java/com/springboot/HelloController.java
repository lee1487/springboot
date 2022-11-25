package com.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${chickenSize}")
	private DataSize chickenSize;

	@GetMapping("/hello")
	public String hello() {
		System.out.println("============");
		System.out.println(chickenSize);
		System.out.println(chickenSize.toMegabytes());
		System.out.println("============");
		return "hello";
	}
}
