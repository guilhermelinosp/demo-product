package com.example.product.controllers;

import com.example.product.entities.Product;
import com.example.product.services.ProductService; // Assuming you have a service class to handle the logic
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    // Constructor Injection
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);  // Call service to save the product
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);  // Return created status with the saved product
    }
}
