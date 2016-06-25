package ua.goit.gojava.module_6.musicshop.main.java;

abstract class Instrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "Instrument {" + getType() + "}";
    }
}
