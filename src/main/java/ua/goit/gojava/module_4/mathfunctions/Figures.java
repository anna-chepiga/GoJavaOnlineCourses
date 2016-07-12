package ua.goit.gojava.module_4.mathfunctions;

public class Figures {
    public static void main(String[] args) {


        int width = 2, height = 4, radius = 5;
        double result;

        result = (width * height) / 2;

        System.out.println("Площадь треугольника равна " + result);

        result = width * height;

        System.out.println("Площадь прямоугольника равна " + result);

        result = (int) (Math.PI * radius * radius);

        System.out.println("Площадь круга равна " + result);
    }
}
