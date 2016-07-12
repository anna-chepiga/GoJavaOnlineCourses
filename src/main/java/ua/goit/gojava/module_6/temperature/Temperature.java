package ua.goit.gojava.module_6.temperature;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

// можно сказать, что здесь антишаблон Божественный объект в условиях маленькой программы.
// можно разбить на отдельные классы для подсчета фаренгейтов из цельсия и наоборот, но это может привести к антишаблону Ненужная сложность
// (опять-таки, в условиях очень маленькой программы)

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
