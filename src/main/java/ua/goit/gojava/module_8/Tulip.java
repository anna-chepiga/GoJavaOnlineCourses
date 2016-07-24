package ua.goit.gojava.module_8;

public class Tulip extends Flower implements Comparable<Tulip> {

    public Tulip(String colour, int amount, String name) {
        super(colour, amount, name);
    }

    public String getName() {
        return "tulips";
    }

    @Override
    public int compareTo(Tulip other) {
        int result = getAmount() - other.getAmount();
        if (result != 0) {
            return result;
        }

        return getColour().compareTo(other.getColour());
    }
}