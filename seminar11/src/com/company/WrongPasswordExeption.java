package com.company;

class WrongPasswordException extends Exception {
    private String message;

    public WrongPasswordException() {
        message = "Неправильный пароль или не совпадение с подстверждением пароля";
    }

    public WrongPasswordException(String message) {
        super(message);
        message = message;
    }

    @Override
    public String getMessage() {
        return "WrongPasswordException: " + message;
    }
}
