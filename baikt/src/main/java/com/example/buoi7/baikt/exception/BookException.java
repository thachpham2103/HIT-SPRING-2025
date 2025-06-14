package com.example.buoi7.baikt.exception;

import com.example.buoi7.baikt.entity.Book;
import lombok.experimental.StandardException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookException {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Long> handlingRuntimeException(RuntimeException exception) {
        return ResponseEntity.badRequest().body(null);
    }
}
