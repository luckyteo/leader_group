package com.devsimple.leader_group.exception;

import java.util.Date;
import java.util.List;

public class ResponseException {
    private Date timestamp;
    private String message;
    private String details;
    private List<String> listDetails;

    public ResponseException(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
    public ResponseException(Date timestamp,String message,
                             List<String> details) {
        this.timestamp = timestamp;
        this.message = message;
        this.listDetails = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public List<String> getListDetails() {
        return listDetails;
    }
}
