package com.example.finalspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalspring.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryName);
    
}
