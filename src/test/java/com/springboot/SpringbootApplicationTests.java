package com.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.assertj.core.api.Assertions;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
	}

}
