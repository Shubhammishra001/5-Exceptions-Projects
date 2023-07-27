package com.User.user;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomUserDetailsService implements UserDetailsService {
 
    @Autowired
    private UserRepository userRepo;
     
    public CustomUserDetails loadUserByUsername(String username) throws Exception {
        User user = userRepo.findByEmail(username);
        System.out.print("--------------------username   "+user.getEmail());
        System.out.print("---------------------username   "+user.getPassword());
        if (user == null) {
            throw new Exception("User not found");
        }
        return new CustomUserDetails(user);
    }
}