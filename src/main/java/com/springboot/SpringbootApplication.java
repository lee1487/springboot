package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

//	@Bean
//	@ConfigurationProperties("server")
//	public ServerProperties serverProperties() {
//		return new ServerProperties();
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
 		app.run(args);
	}
}
