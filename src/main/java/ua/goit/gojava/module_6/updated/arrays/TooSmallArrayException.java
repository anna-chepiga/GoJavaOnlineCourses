package ua.goit.gojava.module_6.updated.arrays;

public class TooSmallArrayException extends Exception {
    public String message;

    public TooSmallArrayException(String message) {
        this.message = message;
    }
}