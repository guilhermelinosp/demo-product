package com.example.product.entities;

import java.math.BigDecimal;

public record Product(String id, String name, String description, BigDecimal price) {

    public Product {
        // Validation logic
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price must be positive and not null");
        }
    }

    // Additional custom methods can go here, though the record takes care of getters, equals, hashCode, and toString automatically.
}