package com.flopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flopes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
