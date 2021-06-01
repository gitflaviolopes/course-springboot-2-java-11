package com.flopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flopes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
