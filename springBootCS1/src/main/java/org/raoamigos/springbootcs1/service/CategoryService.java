package org.raoamigos.springbootcs1.service;

import org.raoamigos.springbootcs1.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    Category getCategoryById(Long categoryId);

    List<Category> getAllCategories();

    Category updateCategory(Long categoryId, Category category);

    void deleteCategory(Long categoryId);
}
