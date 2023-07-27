package com.springpost.springpost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyRestController {
	@Autowired
	private ProductService service;
	
	// SIMPLE METHOD 
	@RequestMapping("/testapi")
	    public String testApi() {
	        return "Hello Shubham welcome in Ajax";
	}  
	 //  FOR DATA SAVE 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveProduct(@ModelAttribute("product") Product product) {
		 System.out.println("--------------test");
		    service.save(product);
		     
		    return "dATA SUCCESFULL INSERT";
		}
	 
	 
	 //after edit
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
		public String editafter(@ModelAttribute("product") Product product) {
		 System.out.println("--------------test");
		    service.editproduct(product);
		     
		    return "new dat aupdated";
		}
	 
	 //fetch data from DB and return 
	 @RequestMapping("/edit/{id}")
	 public Product showEditProductPage(@PathVariable(name = "id") int id) {
	     // ModelAndView mav = new ModelAndView("edit_product");
	     Product product = service.get(id);
	     // mav.addObject("product", product);
	     // return mav;
	     return product;
	 }
	 @RequestMapping(value="/productList", method=RequestMethod.GET)
	 public List<Product> readProducts() {
	     return service.listAll();
	 }
	
	@RequestMapping("/testapi2")
    public String testApi2(@RequestParam String id) {
        return "Hello " + id;
}
	
	//delete /delete/{id}
	//after edit
	 @RequestMapping("/delete/{id}")
	 public String deleteapi(@PathVariable(name = "id") int id)
	 {
		 System.out.println("--------------test");
			    service.deleteById(id);
			     
			    return "deleted";
			}
	
}
