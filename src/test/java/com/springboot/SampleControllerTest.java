package com.springboot;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@WebMvcTest(SampleController.class)
class SampleControllerTest {

	@Autowired
	WebClient webClient;

	@Test
	public void hello() throws Exception {
		HtmlPage page = webClient.getPage("/hello");
		HtmlHeading1 h1 = page.getFirstByXPath("//h1");
		Assertions.assertThat(h1.getTextContent()).isEqualToIgnoringCase("hyeonse");
	}

}