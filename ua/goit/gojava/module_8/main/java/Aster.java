package ua.goit.gojava.module_8.main.java;

public class Aster extends Flower {

    private String colour = "red";
    private int amount;
    private String name = "asters";

    public Aster(String colour, int amount) {
        this.colour = colour;
        this.amount = amount;
    }

    public String getColour() {
        return colour;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return amount + " " + colour + " " + name;
    }
}