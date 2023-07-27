package com.Programme1.Programme1;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService  {
	 @Autowired
	    private ProductRepository repo;
	     
	    public List<Product> listAll() {
	        return repo.findAll();
	    }
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(long id) {
	        return repo.findById(id).get();
	    }
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	    
//	    public List<Product> listAll(Long keyword1) {
//	       System.out.println("-- service -----------------key--------"+keyword1);
//	    	if (keyword1 != null) {
//	    		System.out.println("-- service block          -----------------key--------"+keyword1);
//		    		
//	          //  return repo.search(keyword);
//	    		return repo.findAllById(keyword1);
//	        }else {
//	        	 return repo.findAll();
//	        }
//	       
//	    }
	   
	    public List<Product> listAll(Long maxvalue,Long minvalue) {
		       System.out.println("-- service -----------------key--------"+maxvalue);
		       System.out.println("-- service block          -----------------key--------"+maxvalue+" k-2    "+minvalue);
		       
		       if (maxvalue != null && minvalue!=null) {
		          //  return repo.search(keyword);
		    		return repo.findAllById(maxvalue,minvalue);
		        }
		       // records greater than min id 
		       else if(maxvalue!=null ) {
		        	return repo.findAllByMinId(maxvalue);
		        }
		        // records less than max id 
		        else if(minvalue!=null ) {
		        	return repo.findAllByMaxId(minvalue);
		        }
		        // default condition
		        else {
		        	return repo.findAll();
		        }
		       
		    }
	    public List<Product> listAll(Float maxprice,Float minprice) {
		       System.out.println("-- service -----------------key--------"+maxprice);
		       System.out.println("-- service block          -----------------key--------" +minprice);
		       
		       if (maxprice != 0.0 && minprice!=0.0) {
		          //  return repo.search(keyword);
		    		return repo.findAllByPrice(maxprice,minprice);
		        }
		       // records greater than min--id 
		       else if(maxprice!=0.0 ) {
		    	   
		        	return repo.findAllByMaxPrice(maxprice);
		        }
		        // records less than max id 
		        else if(minprice!=0.0 ) {
		        	return repo.findAllByMinPrice(minprice);
		        }
		        // default condition
		        else {
		        	return repo.findAll();
	        }
		       
		    }
	    
	    
	    
	    
	    }

