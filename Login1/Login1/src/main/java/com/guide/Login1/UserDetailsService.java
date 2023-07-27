package com.guide.Login1;

public interface UserDetailsService {

	UserDetailsService loadUserByUsername(String username) throws ClassNotFoundException;

}
