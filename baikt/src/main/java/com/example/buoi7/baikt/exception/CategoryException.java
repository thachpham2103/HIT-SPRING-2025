package com.example.buoi7.baikt.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CategoryException {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Long> handlingRuntimeException(RuntimeException exception) {
        return ResponseEntity.badRequest().body(null);
    }
}
