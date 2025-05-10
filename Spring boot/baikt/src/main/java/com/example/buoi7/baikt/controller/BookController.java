package com.example.buoi7.baikt.controller;

import com.example.buoi7.baikt.entity.Book;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
 @Autowired
    private BookService bookService;

@GetMapping("/id")
List<Book> getBook(@RequestParam long id){
    return bookService.getBook(id);
}




}
