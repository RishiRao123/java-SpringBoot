package org.raoamigos.springbootcs1.service;

import org.raoamigos.springbootcs1.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Long categoryId, Product product);

    Product getProductById(Long productId);

    List<Product> getAllProducts();

    Product updateProduct(Long productId, Product product);

    void deleteProduct(Long productId);

    List<Product> searchProductsByName(String name);

    List<Product> getProductsByCategory(Long categoryId);
}
