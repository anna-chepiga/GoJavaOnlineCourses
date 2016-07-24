package ua.goit.gojava.module_8;

public class Rose extends Flower{

    private String name = "roses";

    public Rose(String colour, int amount) {
        super(colour, amount);
    }

    public String getColour() { return super.getColour(); }

    public int getAmount() {
        return super.getAmount();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return super.getAmount() + " " + super.getColour() + " " + name;
    }
}