package ua.goit.gojava.module_5.main.java.updated;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Please select: 1) create array randomly; 2) create array manually:");

        Scanner sc = new Scanner(System.in);

        String choice = sc.next();

        switch (choice) {
            case "1":
                System.out.println("The created random array is: " + Arrays.toString(ArrayUtils.randomArray()) + "\n" +
                "In this array: minimum is " + ArrayUtils.min + ", maximum is " + ArrayUtils.max + "\n" +
                "The same array sorted is: " + Arrays.toString(ArrayUtils.sortArray()));
                break;
            case "2":
                System.out.println("The created manual array is: " + Arrays.toString(ArrayUtils.manualArray()) + "\n" +
                "In this array: minimum is " + ArrayUtils.min + ", maximum is " + ArrayUtils.max + "\n" +
                "The same array sorted is: " + Arrays.toString(ArrayUtils.sortArray()));
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }
}