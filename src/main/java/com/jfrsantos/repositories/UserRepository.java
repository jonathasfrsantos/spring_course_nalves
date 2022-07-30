package com.jfrsantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfrsantos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
