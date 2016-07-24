package ua.goit.gojava.module_8;

public class Flower {

    private String colour;
    private int amount;
    private String name;

    public Flower(String colour, int amount) {
        this.colour = colour;
        this.amount = amount;
    }

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
