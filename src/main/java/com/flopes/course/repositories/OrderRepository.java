package com.flopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flopes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
