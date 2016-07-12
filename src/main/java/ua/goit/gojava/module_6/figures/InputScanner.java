package ua.goit.gojava.module_6.figures;

import java.util.Scanner;

public class InputScanner {
    public static int value, width, height;

    public static void readValue() {
        try {
            Scanner sc = new Scanner(System.in);
            value = sc.nextInt();
        } catch (Exception e) {
            System.err.println("[Error]: Value should be an integer number! Please try once again. \n");
        }
    }

    public static void readValueWidthHeight() {
        try {
            Scanner sc = new Scanner(System.in);
            width = sc.nextInt();
            height = sc.nextInt();
        } catch (Exception e) {
            System.err.println("[Error]: Value should be an integer number!");
        }
    }
}