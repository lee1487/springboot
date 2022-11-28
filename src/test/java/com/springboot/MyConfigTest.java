package com.springboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyConfigTest {

	@Autowired MyConfig myConfig;

	@Test
	void myBean() {
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
		System.out.println(myConfig.myBean());
	}

}
