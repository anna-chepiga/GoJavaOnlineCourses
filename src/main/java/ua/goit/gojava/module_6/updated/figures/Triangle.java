package ua.goit.gojava.module_6.updated.figures;

public class Triangle implements Figure {
    private double height, width;

    public void setHeight() {
        this.height = InputScanner.readValue();
    }

    public void setWidth() {
        this.width = InputScanner.readValue();
    }

    @Override
    public double calculateArea() {
        return width * height * 0.5;
    }
}