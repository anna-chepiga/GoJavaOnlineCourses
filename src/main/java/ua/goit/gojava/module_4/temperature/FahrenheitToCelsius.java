package ua.goit.gojava.module_4.temperature;

public class FahrenheitToCelsius extends TemperatureSample {

    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) { this.fahrenheit = fahrenheit; }

    @Override
    public String getType() {
        return "Fahrenheit";
    }

    @Override
    public String getOppositeType() {
        return "Celsius";
    }

    @Override
    public double convert() {
        return (fahrenheit - 32) / 1.8;
    }
}