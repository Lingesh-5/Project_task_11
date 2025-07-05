package com.example.projectTask12.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectTask12.models.Product;
import com.example.projectTask12.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();

    }
    
}
