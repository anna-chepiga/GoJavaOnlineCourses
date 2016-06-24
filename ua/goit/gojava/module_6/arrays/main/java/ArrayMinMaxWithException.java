package ua.goit.gojava.module_6.arrays.main.java;

import java.util.Scanner;

public class ArrayMinMaxWithException {

    public static void main(String[] args) {

        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int arrayLength = scanner.nextInt();

            if (arrayLength <= 0) throw new NegativeArraySizeException();

            if (arrayLength < 3) throw new TooSmallArrayException();

            int[] newArray = new int[arrayLength];

            for (int arrayItem = 0; arrayItem < newArray.length; arrayItem++) {
                newArray[arrayItem] = (int) (Math.random() * 100);
            }

            for (int element : newArray) System.out.print(element + " ");

            int max = newArray[0], min = newArray[0];

            for (int arrayItem = 0; arrayItem < newArray.length; arrayItem++) {
                if (newArray[arrayItem] > max) max = newArray[arrayItem];
                if (newArray[arrayItem] < min) min = newArray[arrayItem];
            }

            System.out.println("\nmax = " + max + "; min = " + min);

        } catch (NegativeArraySizeException hello) {
            System.out.println("[Error]: array length cannot be negative or zero number.");
        } catch (TooSmallArrayException hello) {
            System.out.println("[Warning]: It won't be possible to find min and max in a small array. Please enter an array length more than 2.");
        }

    }
}
