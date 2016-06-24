package ua.goit.gojava.module_6.arrays.main.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortArraysWithException {

    public static void main(String[] args) {

        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int arrayLength = scanner.nextInt();

            if (arrayLength <= 0) throw new NegativeArraySizeException();

            if (arrayLength < 3) throw new TooSmallArrayException();

            if (arrayLength % arrayLength > 0) throw new InputMismatchException();

            int[] arr = new int[arrayLength];
            int arrayItem2;

            for (int randomArrayItem = 0; randomArrayItem < arr.length; randomArrayItem++) {
                arr[randomArrayItem] = (int) (Math.random() * 100);
                System.out.print(arr[randomArrayItem] + ", ");
            }

            System.out.println("\n\nSorted array:");

            for (int arrayItem1 = arr.length - 1; arrayItem1 > 0; arrayItem1--) {
                for (arrayItem2 = 0; arrayItem2 < arrayItem1; arrayItem2++) {
                    if (arr[arrayItem2] > arr[arrayItem2 + 1]) {
                        int tmp = arr[arrayItem2];
                        arr[arrayItem2] = arr[arrayItem2 + 1];
                        arr[arrayItem2 + 1] = tmp;
                    }
                }
            }

            System.out.println(Arrays.toString(arr));
        } catch (NegativeArraySizeException e) {
            System.out.println("[Error]: An array cannot be negative or zero length.");
        } catch (TooSmallArrayException e1) {
            System.out.println("[Warning]: It won't be possible to sort such a small array. Please enter an array length more than 2.");
        } catch (InputMismatchException e) {
            System.out.println("[Error]: Array length should be an integer.");
        }
    }
}
