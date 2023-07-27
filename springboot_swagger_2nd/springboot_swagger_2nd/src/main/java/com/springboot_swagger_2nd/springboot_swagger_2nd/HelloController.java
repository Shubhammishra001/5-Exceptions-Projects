package com.springboot_swagger_2nd.springboot_swagger_2nd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}

//second api
@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse2")
public String m2() {
	return "second api";
}


}
