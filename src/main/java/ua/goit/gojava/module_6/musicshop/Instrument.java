package ua.goit.gojava.module_6.musicshop;

abstract class Instrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "Instrument {" + getType() + "}";
    }
}
