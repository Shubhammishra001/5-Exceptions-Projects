package com.restapi3.restapi3;

import java.util.List;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController<Product> {

    @Autowired
    private ProductService service;
	@GetMapping("/products")
	public List<Product> list() {
	    return Service.listAll();
	}
   
}
