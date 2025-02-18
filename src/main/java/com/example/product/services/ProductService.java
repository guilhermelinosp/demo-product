package com.example.product.services;

import com.example.product.entities.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product saveProduct(Product product) {
        // Logic to save the product (e.g., interacting with a repository)
        return product; // Just returning the product for now
    }
}
