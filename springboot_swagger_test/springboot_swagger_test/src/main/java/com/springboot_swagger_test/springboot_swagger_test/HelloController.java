package com.springboot_swagger_test.springboot_swagger_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/javainuse")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello() {
		return " Happy new year";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/world")
	public String tuyg1() {
		return " Hello World";
	}
}
