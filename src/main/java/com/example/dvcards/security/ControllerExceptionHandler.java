package com.example.dvcards.security;

import com.example.dvcards.exeption.DVCardsException;
import com.example.dvcards.model.RestErrorMessage;
import jakarta.persistence.RollbackException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
@Log4j2
public class ControllerExceptionHandler {
    @ExceptionHandler(DVCardsException.class)
    public ResponseEntity<RestErrorMessage> handlerAuthorizationException(WebRequest request, DVCardsException ex){
        log.warn(ex);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RestErrorMessage(ex.getPublicMessage()));
    }
}
