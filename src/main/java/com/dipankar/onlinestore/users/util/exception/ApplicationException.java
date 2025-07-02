package com.dipankar.onlinestore.users.util.exception;

import lombok.Getter;


@Getter
public class ApplicationException extends Exception {

    private ExceptionType exceptionType;

    public ApplicationException(ExceptionType exceptionType ) {
        super(exceptionType.getMessage());
        this.exceptionType = exceptionType;
    }

}
