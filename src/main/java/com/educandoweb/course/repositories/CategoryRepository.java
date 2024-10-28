package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

// doesn't need to create the implementation of this interface, because the 
// spring.data.jpa already does it
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
