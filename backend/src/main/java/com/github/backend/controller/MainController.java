package com.github.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class MainController {
	private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

	public static final String HELLO_TEXT = "Hello from Spring Boot Backend";
	public static final String SECURED_TEXT = "Hello from the secured resource";

	//@CrossOrigin(origins = "localhost:8080")
	// Set to enable CORS for request for resources from localhost:8080, the origin is different from the one in the cookie it attache to
	@ResponseBody
	@RequestMapping(path = "/hello")
	public String sayHello() {
		LOG.info("GET called on '/hello' resource");
		return HELLO_TEXT;
	}
}
