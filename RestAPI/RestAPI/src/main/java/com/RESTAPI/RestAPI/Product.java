package com.RESTAPI.RestAPI;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan
public class Product {
	    private Integer id;
	    private String name;
	    private float price;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Product(Integer id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
	 
}
