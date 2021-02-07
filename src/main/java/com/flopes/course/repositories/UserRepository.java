package com.flopes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flopes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
