package ua.goit.gojava.module_6.updated.figures;

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