package com.springboot_swagger_test.springboot_swagger_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/other")
public class OtherController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String sayHello() {
		return "OtherController Hello World";
	}
}