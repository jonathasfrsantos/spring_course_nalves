package com.jfrsantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfrsantos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
