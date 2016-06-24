package ua.goit.gojava.module_6.temperature.main.java;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        int celsius, farenheit, result;

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Пожалуйста, введите температуру в цельсиях: ");
            celsius = sc.nextInt();

            result = (int) ((celsius * 1.8) + 32);

            System.out.println(celsius + " градусов по цельсию равно " + result + " градусов по фаренгейту");

            System.out.println("Пожалуйста, введите температуру в фаренгейтах: ");
            farenheit = sc.nextInt();

            result = (int) ((farenheit - 32) / 1.8);
            System.out.println(farenheit + " градусов по фаренгейту равно " + result + " градусов по цельсию");
        } catch (Exception e) {
            System.out.println("Температура должна быть целым числом!");


        }
    }
}
