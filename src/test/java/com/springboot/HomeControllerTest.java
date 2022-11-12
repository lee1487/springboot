package com.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class HomeControllerTest {

	@Autowired MockMvc mockMvc;

	@Test
	@WithMockUser
	public void hello() throws Exception {
		mockMvc.perform(get("/hello")
					.accept(MediaType.TEXT_HTML))
				.andExpect(status().isOk())
				.andExpect(view().name("hello"));
	}

	@Test
	@WithMockUser
	public void my() throws Exception {
		mockMvc.perform(get("/my"))
				.andExpect(status().isOk())
				.andExpect(view().name("my"));
	}

}
