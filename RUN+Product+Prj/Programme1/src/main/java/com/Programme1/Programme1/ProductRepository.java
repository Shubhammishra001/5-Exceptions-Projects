
package com.Programme1.Programme1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAll();
    //SELECT * from product where id<2;
     @Query("SELECT p FROM Product p WHERE range(p.id) LIKE %?1%")
	//@Query("SELECT p FROM Product p  WHERE p.id>keyword")
	//@Query("SELECT p FROM Products p WHERE p.price<keyword")
	public List<Product> search(String keyword);
	
	@Query("select p from Product p where p.id >= ?1")
	List<Product> findAllByMaxId(Long minvalue);

	@Query("select p from Product p where p.id <= ?1")
	List<Product> findAllByMinId(Long maxvalue);
	
	
	@Query("select p from Product p WHERE  p.id BETWEEN  ?1 AND ?2")
	 List<Product> findAllById(Long maxvalue,Long minvalue);
	
//for price 
	//List<Product> findAll();
    //SELECT * from product where id<2;
//@Query("SELECT p FROM Product p WHERE range(p.price) LIKE %?1%")
	//@Query("SELECT p FROM Product p  WHERE p.id>keyword")
	//@Query("SELECT p FROM Products p WHERE p.price<keyword")
	//public List<Product> search(String Price);
	
	@Query("select p from Product p where p.price >= ?1")
	List<Product> findAllByMaxPrice(Float maxprice);

	@Query("select p from Product p where p.price <= ?1")
	List<Product> findAllByMinPrice(Float minprice);
	
	
	@Query("select p from Product p WHERE  p.price BETWEEN  ?1 AND ?2")
	 List<Product> findAllByPrice(Float maxprice,Float minprice);
	

}
