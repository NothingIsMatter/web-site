package com.oopwebsite.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Login already in use!")
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String s){
        super(s);
    }
}
