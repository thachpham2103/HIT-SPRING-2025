package com.example.buoi7.baikt.service;

import com.example.buoi7.baikt.dto.request.AuthorCreateRequest;
import com.example.buoi7.baikt.dto.request.AuthorUpdateRequest;
import com.example.buoi7.baikt.dto.request.CategoryCreateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.entity.Category;
import com.example.buoi7.baikt.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategory(long id){
        return categoryRepository.findAll();
    }

    public Category createCategory(CategoryCreateRequest request){
        Category category= new Category();

        category.setName(request.getName());

        return categoryRepository.save(category);
    }


    public void deleteCategory(long id){
        categoryRepository.deleteById(id);
    }

    public Category getCategoryId(long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

}
