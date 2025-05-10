package com.example.buoi7.baikt.controller;

import com.example.buoi7.baikt.dto.request.AuthorCreateRequest;
import com.example.buoi7.baikt.dto.request.CategoryCreateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.entity.Category;
import com.example.buoi7.baikt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cate")

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/id")
    List<Category> getCategory(@RequestParam long id){
        return categoryService.getCategory(id);
    }

    @PostMapping("/create")
    Category createCategory(CategoryCreateRequest request){
        return categoryService.createCategory(request);
    }

    @DeleteMapping("/{id}")
    String deleteCategory(@PathVariable long id){
        categoryService.deleteCategory(id);
        return "thanh cong!";
    }


    @GetMapping("/categoryId")
    public Optional<Category> getByCategory(@RequestParam("categoryId") long categoryId) {
        return Optional.ofNullable(categoryService.getCategoryId(categoryId));
    }
}
