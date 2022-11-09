package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.springboot.account.Account;
import com.springboot.account.AccountRepository;

@SpringBootApplication
public class SpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
