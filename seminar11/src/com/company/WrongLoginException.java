package com.company;

public class WrongLoginException extends Exception {
    private String message;

    public WrongLoginException() {
        message = "Неправильный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        message = message;
    }

    @Override
    public String getMessage() {
        return "WrongLoginException: " + message;
    }
}