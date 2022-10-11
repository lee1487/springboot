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
	private HyeonseProperties properties;

	@Override
	public void run(ApplicationArguments arguments) throws Exception {
		System.out.println("================");
		System.out.println(properties.getName());
		System.out.println(properties.getFullname());
		System.out.println("================");
	}



}
