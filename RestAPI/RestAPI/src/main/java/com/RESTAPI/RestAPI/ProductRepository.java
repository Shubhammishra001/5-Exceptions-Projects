package com.RESTAPI.RestAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductRepository extends JpaRepository <Product,Integer>{

}
