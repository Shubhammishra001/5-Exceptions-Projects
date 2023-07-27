package com.restapi3.restapi3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	 @Autowired
	    private ProductRepository repo;
	     
	    public List<Producer> listAll() {
	        return repo.findAll();
	    }
	     
}
