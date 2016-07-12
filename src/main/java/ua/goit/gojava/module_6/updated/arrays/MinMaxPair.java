package ua.goit.gojava.module_6.updated.arrays;

public class MinMaxPair {

    private int min, max;

    public MinMaxPair(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "In the array minimum is " + min + ", maximum is " + max;
    }
}