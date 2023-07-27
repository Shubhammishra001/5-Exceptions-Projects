package com.RESTAPI.RestAPI;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.catalina.mbeans.ServiceMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService {
	@Autowired
    private ProductRepository repo;
	 public void save(Product product) {
	        repo.save(product);
	    }
	 public List<Product> listAll() {
	        return repo.findAll();
	    }
	 public Product get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete1(Integer id) {
	        repo.deleteById(id);
	    }
	   
	 }
