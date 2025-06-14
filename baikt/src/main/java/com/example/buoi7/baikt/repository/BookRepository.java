package com.example.buoi7.baikt.repository;

import com.example.buoi7.baikt.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
//    Optional<Book> findById(Long id);
}

