package com.springboot.user;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void hello() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("hello"));
	}

	@Test
	public void createUser_JSON() throws Exception {
		String userJson="{\"username\":\"hyeonse\", \"password\":\"123\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.content(userJson))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.username", is(equalTo("hyeonse"))))
		.andExpect(jsonPath("$.password", is(equalTo("123"))));
	}

	@Test
	public void createUser_XML() throws Exception {
		String userJson="{\"username\":\"hyeonse\", \"password\":\"123\"}";
		mockMvc.perform(post("/users/create")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_XML)
				.content(userJson))
		.andExpect(status().isOk())
		.andExpect(xpath("/User/username").string("hyeonse"))
		.andExpect(xpath("/User/password").string("123"));
	}
}
