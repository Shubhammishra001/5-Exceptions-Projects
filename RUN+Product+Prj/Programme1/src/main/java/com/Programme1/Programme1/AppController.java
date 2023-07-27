package com.Programme1.Programme1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {
	@Autowired
    private ProductService service;
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     return "index";
	}
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Product product = new Product();
	    System.out.println("---------------------/new---------------------");
	    model.addAttribute("product", product);
	     
	    return "new_product";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    service.save(product);
	     System.out.println("---------------------/save---------------------");
	    return "redirect:/";
	}
	@RequestMapping("/inputmin")
	public String showminvalue(Model model) {
	    Product product = new Product();
	    System.out.println("---------------------/new---------------------");
	    model.addAttribute("product", product);
	     
	    return "inputmin";
	}
//	 @RequestMapping("/Z1")
//	   public String viewHomePage1(Model model, @Param("keyword") Long keyword1) {
//		 System.out.println("-------------------key--------"+keyword1);
//	       List<Product> listProducts = service.listAll(keyword1);
//	       model.addAttribute("listProducts", listProducts);
//	       model.addAttribute("keyword1", keyword1);
//	        
//	       return "index";
//	   }
	 @RequestMapping("/minmax")
	   public String minmax(Model model, @Param("maxvalue") Long maxvalue,@Param("minvalue") Long minvalue) {
		 System.out.println("-------------------key--------"+maxvalue);
	       List<Product> listProducts = service.listAll(maxvalue,minvalue);
	       model.addAttribute("listProducts", listProducts);
	       model.addAttribute("keyword1", maxvalue);
	       model.addAttribute("keyword2",maxvalue);
	        
	       return "index";
	   }
	 @RequestMapping("/ZP")
	   public String viewHomePrice(Model model, @Param("maxprice") Float maxprice,@Param("minprice") Float minprice) {
		 System.out.println("------------------controller max---------"+maxprice);
		 System.out.println("------------------controller min---------"+minprice);
	       List<Product> listProducts = service.listAll(maxprice,minprice);
	       model.addAttribute("listProducts", listProducts);
	       model.addAttribute("maxprice", maxprice);
	       model.addAttribute("minprice",maxprice);
	        
	       return "index";
	   }
	 @RequestMapping("/edit/{id}")
	 public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	     ModelAndView mav = new ModelAndView("edit_product");
	     Product product = service.get(id);
	     mav.addObject("product", product);
	      
	     return mav;
	 }
	 @RequestMapping("/delete/{id}")
	 public String deleteProduct(@PathVariable(name = "id") int id) {
	     service.delete(id);
	     return "redirect:/";       
	 }

}
