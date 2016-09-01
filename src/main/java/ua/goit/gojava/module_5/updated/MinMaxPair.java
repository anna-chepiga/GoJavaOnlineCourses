package ua.goit.gojava.module_5.updated;

public class MinMaxPair {
    private int min, max;

    public MinMaxPair(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "In the array minimum is " + min + ", maximum is " + max;
    }
}