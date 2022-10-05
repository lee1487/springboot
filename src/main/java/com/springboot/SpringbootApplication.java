package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setBanner((environment, sourceClass, out) -> {
			out.println("==================");
			out.println("HyeonSe");
			out.println("==================");
		});
		//app.setBannerMode(Banner.Mode.OFF);
 		app.run(args);
	}
}
