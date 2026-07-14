package com.eakpinaroglu.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eakpinaroglu.productapi.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
}
