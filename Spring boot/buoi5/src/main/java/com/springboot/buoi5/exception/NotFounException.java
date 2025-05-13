package com.springboot.buoi5.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class NotFounException extends RuntimeException {
  private String message;

  private HttpStatus httpStatus;

  private String [] params;

  public NotFounException(String message){
      super(message);
      this.message=message;
      this.httpStatus=HttpStatus.NOT_FOUND;
  }

  public NotFounException(String message, HttpStatus httpStatus){
      super(message);
      this.message=message;
      this.httpStatus=HttpStatus.NOT_FOUND;

  }

    public NotFounException(String message, String [] params){
        super(message);
        this.message=message;
        this.params=params;
        this.httpStatus=HttpStatus.NOT_FOUND;

    }

    public NotFounException(String message, HttpStatus httpStatus, String [] params){
        super(message);
        this.message=message;
        this.httpStatus=httpStatus;
        this.params=params;
        this.httpStatus=HttpStatus.NOT_FOUND;

    }



}
