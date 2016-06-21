package ua.goit.gojava.module_5.main.java;

import java.util.Arrays;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] myArray = new int[15];

        for (int a = 0; a < myArray.length; a++) {
            myArray[a] = (int) (Math.random() * 100);
        }

        for (int element : myArray) {
            System.out.print(element + " ");
        }

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }

            if (myArray[i] < min) {
                min = myArray[i];
            }

        }

        System.out.println("\n max = " + max + "; min = " + min);
    }
}