package org.raoamigos.springbootcs1.repository;

import org.raoamigos.springbootcs1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Productrepository extends JpaRepository<Product, Long> {

    List<Product> findByProductNameContainingIgnoreCase(String productName);

    List<Product> findByCategoryCategoryId(Long categoryId);
}
