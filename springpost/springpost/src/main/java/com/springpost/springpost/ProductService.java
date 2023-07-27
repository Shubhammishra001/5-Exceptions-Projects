package com.springpost.springpost;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProductService {
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
     
    public void delete(Product product) {
        repo.deleteById(product.getId());
    }

	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	//editing 
	
	public Product editproduct(Product request) {
		Product product = repo.findById(request.getId()).orElse(null);

		try {
			if (product != null) {

				product.setName(request.getName());
				product.setPrice(request.getPrice());
				product.setMadein(request.getMadein());
				product.setBrand(request.getBrand());
				repo.save(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public void deleteById(int id) {
		 repo.deleteById((long) id);
	}
}
