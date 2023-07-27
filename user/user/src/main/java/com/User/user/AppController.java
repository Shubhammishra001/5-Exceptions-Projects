package com.User.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public class AppController {
	@Autowired
    private UserRepository userRepo;
     
    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }
   
}
