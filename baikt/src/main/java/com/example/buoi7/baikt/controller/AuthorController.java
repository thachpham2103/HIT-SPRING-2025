package com.example.buoi7.baikt.controller;

import com.example.buoi7.baikt.dto.request.AuthorCreateRequest;
import com.example.buoi7.baikt.dto.request.AuthorUpdateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aut")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/id")
    List<Author> getAuthor(@RequestParam long id){
        return authorService.getAuthor(id);
    }

    @PostMapping("/create")
    Author createAuthor(@RequestBody AuthorCreateRequest request){
        return authorService.createAuthor(request);
    }

    @PutMapping("/{id}")
    public Author updateEmployees(@PathVariable long id, @RequestBody AuthorUpdateRequest request){
        return authorService.updateAuthor(request, id);
    }


    @DeleteMapping("/{id}")
    String deleteAuthor(@PathVariable long id){
        authorService.deleteAuthor(id);
        return "thanh cong!";
    }

    @GetMapping("/authorId")
    public Optional<Author> getByAuthor(@RequestParam("authorId") long authorId) {
        return Optional.ofNullable(authorService.getAuthorId(authorId));
    }
}
