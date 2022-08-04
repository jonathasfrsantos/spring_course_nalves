package com.jfrsantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfrsantos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
