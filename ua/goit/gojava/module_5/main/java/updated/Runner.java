package ua.goit.gojava.module_5.main.java.updated;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("1) random massive; 2) manual massive");

        Scanner sc = new Scanner(System.in);

        String choice = sc.next();

        switch (choice) {
            case "1":
                System.out.println("random array is " + Arrays.toString(ArrayUtils.randomArray()));
                System.out.println("min " + ArrayUtils.min + " max " + ArrayUtils.max);
                break;
            case "2":
                System.out.println("manual array is " + Arrays.toString(ArrayUtils.manualArray()));
                System.out.println("min " + ArrayUtils.min + " max " + ArrayUtils.max);
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }
}