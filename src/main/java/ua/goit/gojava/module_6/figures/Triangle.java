package ua.goit.gojava.module_6.figures;

public class Triangle implements Figure {

    private static final String printVar = "You selected triangle, please enter height and width";
    private double height;
    private double width;

    public void setHeight() {
        this.height = InputScanner.height;
    }

    public void setWidth() {
        this.width = InputScanner.width;
    }

    @Override
    public void printIncomeParameters() {
        System.out.println(printVar);
        InputScanner.readValueWidthHeight();
    }

    @Override
    public double calculate() {
        return width * height * 0.5;
    }
}