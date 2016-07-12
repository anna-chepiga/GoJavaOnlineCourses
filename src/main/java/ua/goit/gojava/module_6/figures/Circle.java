package ua.goit.gojava.module_6.figures;

public class Circle implements Figure {
    private static final String printVar = "You selected circle, please enter radius";

    private double radius;

    public void setRadius() {
        this.radius = InputScanner.value;
    }

    @Override
    public void printIncomeParameters() {
        System.out.println(printVar);
        InputScanner.readValue();
    }

    @Override
    public double calculate() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}