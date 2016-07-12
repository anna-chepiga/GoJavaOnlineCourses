package ua.goit.gojava.module_4.figures;

public class Circle implements Figure {
    private double radius;

    public void setRadius() {
        this.radius = InputScanner.readValue();
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}