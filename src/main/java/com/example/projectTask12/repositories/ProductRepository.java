package com.example.projectTask12.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectTask12.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
