package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner applicationRunner () {
		return new ApplicationRunner() {
			
			@Autowired FamilyMan familyMan;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("==============================");
				System.out.println(familyMan.getName());
				System.out.println("==============================");
			}
		};
	}

	@Bean
	public FamilyMan familyMan() {
		FamilyMan familyMan = new FamilyMan();
		familyMan.setName("hyeonse");
		return familyMan;
	}
}
