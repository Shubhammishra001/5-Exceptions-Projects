package com.hellowJWT.hellowJWT;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    
	@RequestMapping({ "/hello" })
	public String firstPage() {
		System.out.println("Test");
		return "Hello-- World";
	}
}
