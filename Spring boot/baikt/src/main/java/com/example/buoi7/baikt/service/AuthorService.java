package com.example.buoi7.baikt.service;

import com.example.buoi7.baikt.dto.request.AuthorCreateRequest;
import com.example.buoi7.baikt.dto.request.AuthorUpdateRequest;
import com.example.buoi7.baikt.entity.Author;
import com.example.buoi7.baikt.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAuthor(long id){
        return authorRepository.findAll();
    }

public Author createAuthor(AuthorCreateRequest request){
        Author author= new Author();

        author.setName(request.getName());
        author.setBio(request.getBio());
        author.setDod(request.getDod());

        return authorRepository.save(author);
}

    public Author getAuthorId(long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }


    public Author updateAuthor(AuthorUpdateRequest request, long id){
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found"));
    author.setName(request.getName());
    author.setBio(request.getBio());
    author.setDod(request.getDod());

    return authorRepository.save(author);
}

public void deleteAuthor(long id){
        authorRepository.deleteById(id);
}


}
