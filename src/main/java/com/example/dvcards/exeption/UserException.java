package com.example.dvcards.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserException extends DVCardsException{
    public UserException(String message){
        super(message, message);
    }
}
