package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = " Probléme !!! ")
public class SecondCustomException extends RuntimeException{

    public SecondCustomException(String message){
        super(message);
    }
}
