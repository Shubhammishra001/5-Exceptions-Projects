package com.springpost.springpost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MyController {
	@Autowired
	private ProductService service;

	 @RequestMapping("/hello")
	 public String viewHomePage(Model model) {
		    List<Product> listProducts = service.listAll();
		    model.addAttribute("listProducts", listProducts);
		 
	        return "index";
	}  
	 @RequestMapping("/new")
		public String showNewProductPage(Model model) {
		    Product product = new Product();
		    model.addAttribute("product", product);
		      return "new_product";
		}
	//display data 
	 @RequestMapping("/display")
	 public String display(Model model) {
		    List<Product> listProducts = service.listAll();
		    model.addAttribute("listProducts", listProducts);
	        return "display";
	}  
	 
	 
	@RequestMapping("/hello2")
	    public String hello2() {
	        return "index2";
	}  
}
