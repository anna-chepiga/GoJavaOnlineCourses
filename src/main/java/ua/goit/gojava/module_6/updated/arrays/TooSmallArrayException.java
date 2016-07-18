package ua.goit.gojava.module_6.updated.arrays;

public class TooSmallArrayException extends Exception {

    public TooSmallArrayException() {
        super("[Warning] It will not be possible to sort such a small array. " +
                "Array should contain at least 5 items");
    }
}