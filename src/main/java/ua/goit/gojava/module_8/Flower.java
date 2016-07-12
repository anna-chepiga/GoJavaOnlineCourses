package ua.goit.gojava.module_8;

public class Flower {

    private String colour;
    private int amount;
    private String name;

    public String getColour() { return colour; }

    public int getAmount() {
        return amount;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return amount + " " + colour + " " + name;
    }
}
