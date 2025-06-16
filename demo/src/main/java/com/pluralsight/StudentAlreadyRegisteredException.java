package com.pluralsight;

public class StudentAlreadyRegisteredException extends RuntimeException {
    public StudentAlreadyRegisteredException(String message) {
        super(message);
    }
}

