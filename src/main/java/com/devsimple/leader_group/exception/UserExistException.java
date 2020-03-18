package com.devsimple.leader_group.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CREATED)
public class UserExistException extends RuntimeException {
    public UserExistException(String message) {
        super(message);
    }
}
