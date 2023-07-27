package com.restapi3.restapi3;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

public interface ProductRepository extends JpaRepository <Product, Integer> {

	List<Producer> findAll();

}
