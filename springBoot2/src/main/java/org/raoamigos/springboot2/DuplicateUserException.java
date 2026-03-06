package org.raoamigos.springboot2;

public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String email) {
        super("Duplicate user  " + email + " aldready exists");
    }
}
