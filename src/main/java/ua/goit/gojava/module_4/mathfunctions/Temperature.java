package ua.goit.gojava.module_4.mathfunctions;

public class Temperature {

    public static void main(String[] args) {

    double farenheit = 20, celsius = 20, result;

    result = (int) ((celsius * 1.8) + 32);
    System.out.println(celsius + " градусов по цельсию равно " + result + " по фаренгейту");

    result = (int) ((farenheit - 32) / 1.8);
    System.out.println(farenheit + " градусов по фаренгейту равно " + result + " по цельсию");

    }
}
