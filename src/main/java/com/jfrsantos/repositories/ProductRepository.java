package com.jfrsantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfrsantos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
