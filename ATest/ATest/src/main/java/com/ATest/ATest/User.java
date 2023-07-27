package com.ATest.ATest;

import org.hibernate.annotations.GenerationTime;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@EntityScan
public class User{
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	 
               @Id
               @GeneratedValue(strategy = GenerationType.AUTO)
               int id;
               String name;
               User(int id, String name)
               {
                   this.id = id;
                   this.name = name;
               }
               
			
}
