package ua.goit.gojava.module_6.updated.figures;

public class Triangle implements Figure {
    private double height, width;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height * 0.5;
    }
}