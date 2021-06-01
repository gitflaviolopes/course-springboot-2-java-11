package com.flopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flopes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
