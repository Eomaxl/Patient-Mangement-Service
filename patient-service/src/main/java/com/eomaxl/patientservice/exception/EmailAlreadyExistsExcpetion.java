package com.eomaxl.patientservice.exception;

public class EmailAlreadyExistsExcpetion extends RuntimeException {
    public EmailAlreadyExistsExcpetion(String message) {
        super(message);
    }
}
