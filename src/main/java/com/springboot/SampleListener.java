package com.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationRunner{

//	public SampleListener(ApplicationArguments arguments) {
//		System.out.println("foo: " + arguments.containsOption("foo"));
//		System.out.println("bar: " + arguments.containsOption("bar"));
//	}

	@Override
	public void run(ApplicationArguments arguments) throws Exception {
		System.out.println("foo: " + arguments.containsOption("foo"));
		System.out.println("bar: " + arguments.containsOption("bar"));
	}



}
