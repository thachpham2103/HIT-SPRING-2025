package com.example.buoi7.baikt.repository;

import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
//    Optional<Category> findByCategoryId(Long categoryId);

}
