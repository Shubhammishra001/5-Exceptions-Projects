package com.passdata.passdata;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	 @GetMapping("/") 
	    public String home() {
	        return "home-page";
	    }
	 @RequestMapping(value = "/processForm")
		public String showDashboardPage(HttpServletRequest request, Model theModel) {
			//String name = request.getParameter("empName");
//			String email = request.getParameter("empemail");
//			String password = request.getParameter("emppassword");
//			String phone = request.getParameter("empphone");
		theModel.addAttribute("empName", request.getParameter("empName"));
		theModel.addAttribute("empemail", request.getParameter("empemail"));
		theModel.addAttribute("emppassword", request.getParameter("emppassword"));
		theModel.addAttribute("empphone", request.getParameter("empphone"));
			return "dashboard";
		}
}
