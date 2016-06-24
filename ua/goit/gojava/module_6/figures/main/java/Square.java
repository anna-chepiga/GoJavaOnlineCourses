package ua.goit.gojava.module_6.figures.main.java;

public class Square implements Figure {

    private static final String printVar = "You selected square, please enter side length";

    private double side;

    public void setSide() {
        this.side = InputScanner.value;
    }

    @Override
    public void printIncomeParameters() {
        System.out.println(printVar);
        InputScanner.readValue();
    }

    @Override
    public double calculate() {
        return side * side;
    }
}