package com.User.user;

import java.util.Collection;

public class CustomUserDetails<GrantedAuthority> implements UserDetailsService {
 
    private User user;
     
    public CustomUserDetails(User user) {
        this.user = user;
    }
 
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
 
    public String getPassword() {
        return user.getPassword();
    }
 
 
    public String getUsername() {
        return user.getEmail();
    }
    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }
 
}