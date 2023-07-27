package com.fromvalidation.fromvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {
public String checkfunction1() {
	return "index";
}
@GetMapping("/p2")
public String checkfunction2() {
	return "p2";
}

}
