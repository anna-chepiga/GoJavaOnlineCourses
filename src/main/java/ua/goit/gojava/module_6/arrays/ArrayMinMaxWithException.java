package ua.goit.gojava.module_6.arrays;

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

            for (int aNewArray : newArray) {
                if (aNewArray > max) max = aNewArray;
                if (aNewArray < min) min = aNewArray;
            }

            System.out.println("\nmax = " + max + "; min = " + min);

        } catch (NegativeArraySizeException e) {
            System.out.println("[Error]: array length cannot be negative or zero number.");
        } catch (TooSmallArrayException e) {
            System.out.println("[Warning]: It won't be possible to find min and max in a small array. Please enter an array length more than 2.");
        }

    }
}
