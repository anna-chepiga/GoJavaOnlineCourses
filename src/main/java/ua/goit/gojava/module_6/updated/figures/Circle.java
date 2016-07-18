package ua.goit.gojava.module_6.updated.figures;

public class Circle implements Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}