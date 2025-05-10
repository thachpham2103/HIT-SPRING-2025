package com.example.buoi7.baikt.controller;

import com.example.buoi7.baikt.dto.request.BookCreateRequest;
import com.example.buoi7.baikt.dto.request.BookUpdateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.entity.Book;
import com.example.buoi7.baikt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
 @Autowired
    private BookService bookService;

@GetMapping("/id")
List<Book> getBook(@RequestParam long id){
    return bookService.getBook(id);
}

@PostMapping("/create")
    public Book cretaeBook(@RequestBody BookCreateRequest request){
    return bookService.createBook(request);
}

@PutMapping("{/id}")
    public Book updateBook(@RequestBody BookUpdateRequest request, @RequestParam long id){
    return bookService.updateBook(request,id);
}

@DeleteMapping("{/id}")
    public String deleteBook(@RequestParam long id){
    bookService.deleteBook(id);
    return "thanh coong!!";
}

    @GetMapping("/authorId")
    public Optional<Book> getByBook(@RequestParam("bookId") long bookId) {
        return Optional.ofNullable(bookService.getBookId(bookId));
    }
}
