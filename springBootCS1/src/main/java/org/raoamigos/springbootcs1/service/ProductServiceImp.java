package org.raoamigos.springbootcs1.service;

import lombok.RequiredArgsConstructor;
import org.raoamigos.springbootcs1.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {
    @Override
    public Product createProduct(Long categoryId, Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public List<Product> searchProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(Long categoryId) {
        return List.of();
    }
}
