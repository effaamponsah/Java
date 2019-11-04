package io.turntabl.java;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super();
    }

    public StudentNotFoundException(final String message) {
        super(message);
    }
}
