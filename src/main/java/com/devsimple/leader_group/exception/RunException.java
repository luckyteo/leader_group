package com.devsimple.leader_group.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class RunException extends RuntimeException {
    public RunException(String message) {
        super(message);
    }
}
