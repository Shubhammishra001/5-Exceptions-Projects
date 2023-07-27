package com.filehandingprj.filehandingprj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	 @RequestMapping("/")
	    public String home() {
	        System.out.println("Going home...");
	        return "index";
	    }
	 @PostMapping(value = "/p")
		
	 public String showDashboardPage(HttpServletRequest request, Model theModel) {
		 System.out.println("-------------m2");
		 String name = request.getParameter("empName");
			System.out.print("  name  "+name);
			theModel.addAttribute("empName", name);
			return "dashboard";
		}
	
}
