package com.example.buoi7.baikt.repository;

import com.example.buoi7.baikt.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
//    Optional<Author> findByAuthorId(Long authorId);
}
