package ua.goit.gojava.module_8;

public class Daisy extends Flower {

    private String colour;
    private int amount;
    private String name = "daisies";

    public Daisy(String colour, int amount) {
        this.colour = colour;
        this.amount = amount;
    }

    public String getColour() { return colour; }

    public int getAmount() { return amount; }

    public String getName() {
        return name;
    }

    public String toString() {
        return amount + " " + colour + " " + name;
    }
}