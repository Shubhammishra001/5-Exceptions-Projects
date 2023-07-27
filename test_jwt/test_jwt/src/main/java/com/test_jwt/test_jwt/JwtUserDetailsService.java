package com.test_jwt.test_jwt;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService<UserDetails> {
	public UserDetails loadUserByUsername(String username) throws ClassNotFoundException {
		if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new ClassNotFoundException("User not found with username: " + username);
		}
	}
}
