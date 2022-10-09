package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class SampleListener implements ApplicationRunner{

	@Autowired
	HyeonseProperties properties;

	@Override
	public void run(ApplicationArguments arguments) throws Exception {
		System.out.println("================");
		System.out.println(properties.getName());
		System.out.println(properties.getAge());
		System.out.println("================");
	}



}
