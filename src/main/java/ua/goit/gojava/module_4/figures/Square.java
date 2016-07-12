package ua.goit.gojava.module_4.figures;

public class Square implements Figure {
    private double side;

    public void setSide() {
        this.side = InputScanner.readValue();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}