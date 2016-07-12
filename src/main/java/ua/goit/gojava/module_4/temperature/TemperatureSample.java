package ua.goit.gojava.module_4.temperature;

public abstract class TemperatureSample {
    abstract String getType();
    abstract String getOppositeType();
    abstract double convert();
}
