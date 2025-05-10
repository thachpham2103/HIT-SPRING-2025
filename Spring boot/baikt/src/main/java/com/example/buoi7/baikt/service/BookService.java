package com.example.buoi7.baikt.service;

import com.example.buoi7.baikt.dto.request.AuthorCreateRequest;
import com.example.buoi7.baikt.dto.request.AuthorUpdateRequest;
import com.example.buoi7.baikt.dto.request.BookCreateRequest;
import com.example.buoi7.baikt.dto.request.BookUpdateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.entity.Book;
import com.example.buoi7.baikt.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBookId(long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public List<Book> getBook(long id){
        return bookRepository.findAll();
    }

    public Book createBook(BookCreateRequest request){
       Book book = new Book();

        book.setName(request.getName());
        book.setPrice(request.getPrice());
        book.setDesciption(request.getDesciption());

        return bookRepository.save(book);
    }

    public Book updateBook(BookUpdateRequest request, long id){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.setName(request.getName());
        book.setPrice(request.getPrice());
        book.setDesciption(request.getDesciption());

        return bookRepository.save(book);
    }

    public void deleteBook(long id){
        bookRepository.deleteById(id);
    }




}

