package com.User.user;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTests {
	
		 
	    @Autowired
	    private EntityManager entityManager;
	     
	    @Autowired
	    private UserRepository repo;
	     
	    @Test
	    public void testCreateUser() {
	        User user = new User();
	        user.setEmail("ravikumar@gmail.com");
	        user.setPassword("ravi2020");
	        user.setFirstName("Ravi");
	        user.setLastName("Kumar");
	         
	        User savedUser = repo.save(user);
	         
	        User existUser = entityManager.find(User.class, savedUser.getId());
	         
	     //  assertthat(user.getEmail()).isEqualTo(existUser.getEmail());
	
	    }

		
}
