package com.mart.exception;

import java.util.List;

public class InvalidProductException extends RuntimeException {

    private final List<String> errors;

    public InvalidProductException(List<String> errors) {
        super("Invalid product data");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
