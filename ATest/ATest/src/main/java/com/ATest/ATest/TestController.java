package com.ATest.ATest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class TestController {
	@RequestMapping("/")  
  public String print()
  {
	  return "hello";
  }
}
