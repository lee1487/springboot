package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hyeonse.Holoman;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringbootApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Bean
	public Holoman holoman() {
		Holoman holoman = new Holoman();
		holoman.setName("hyeonse");
		holoman.setHowLong(60);
		return holoman;
	}

}
