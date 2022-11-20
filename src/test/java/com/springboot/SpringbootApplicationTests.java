package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.assertj.core.api.Assertions;
import org.junit.Test;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
	}

}
