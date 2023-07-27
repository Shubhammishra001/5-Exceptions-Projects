package com.NetTest.nettest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	   public String viewHomePage() {
	        return "login";
	   }
	@RequestMapping(value="/login",method=RequestMethod.GET)
	   public String check(ModelMap model,@RequestParam String userid ,@RequestParam String password) {
		if(userid.equals("abc") && password.equals("1234"))
		{
	        return "welcome";
	   }
		model.put("errorMsg","please enter right info");
		return "login";
	}
	
	
}
