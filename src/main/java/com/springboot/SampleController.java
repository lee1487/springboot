package com.springboot;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public EntityModel<Hello> hello() {
		Hello hello = new Hello();
		hello.setPrefix("Hey,");
		hello.setName("Hyeonse");

		EntityModel<Hello> entityModel = EntityModel.of(hello);
		entityModel.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());
		return entityModel;
	}

}
