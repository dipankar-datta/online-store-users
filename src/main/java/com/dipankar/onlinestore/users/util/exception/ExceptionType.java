package com.dipankar.onlinestore.users.util.exception;

public enum ExceptionType {
    USER_NOT_FOUND("User not found"),
    NO_DATA_FOUND("No data found"),
    INVALID_REQUEST("Invalid request");

    private final String message;

    ExceptionType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
