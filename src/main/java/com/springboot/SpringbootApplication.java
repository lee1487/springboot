package com.springboot;

import java.time.Period;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

	@Value("${chicken.howlong}")
	private Period chickenHowLong;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> System.out.println(chickenHowLong.getMonths());
	}

}
