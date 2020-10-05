package com.learn.exception;

public class exception extends Exception {
    private String message;

    public exception(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
