package ua.goit.gojava.module_4.temperature;

public class CelsiusToFahrenheit extends TemperatureSample {

    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public String getType() { return "Celsius"; }

    @Override
    public String getOppositeType() {
        return "Fahrenheit";
    }

    @Override
    public double convert() {
        return (celsius * 1.8) + 32;
    }
}