package ua.goit.gojava.module_4.mathfunctions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        // посчет площади прямоугольника с величинами, введенными с клавиатуры
        int width, height, result;

        while(true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Введите ширину прямоугольника: ");
                width = sc.nextInt();

                System.out.print("Введите высоту прямоугольника: ");
                height = sc.nextInt();

                System.out.println();

                result = width * height;

                System.out.println("Площадь вашего прямоугольника: " + result);
                return;

            } catch (Exception E) {
                System.out.println("Неправильные данные. Введите целое число!");
            }
        }
    }
}
