package com.springboot;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
	}

}
