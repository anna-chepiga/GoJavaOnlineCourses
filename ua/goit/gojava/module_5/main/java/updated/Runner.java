package ua.goit.gojava.module_5.main.java.updated;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please select: 1) create array randomly; 2) create array manually:");
        String choice = sc.next();

        switch (choice) {
            case "1":
                int[] randomArray = createArray(sc);
                System.out.println("The created random array is: " + Arrays.toString(ArrayUtils.createRandomArray(randomArray)));
                System.out.println("The same array sorted is: " + Arrays.toString(ArrayUtils.sortArray(randomArray, randomArray.length)));
                MinMaxPair minMax = ArrayUtils.getMinMax(randomArray);
                System.out.println(minMax);
                break;
            case "2":
                int[] manualArray = createArray(sc);
                System.out.println("Please enter array elements:");
                for (int i = 0; i < manualArray.length; i++) {
                    manualArray[i] = sc.nextInt();
                }
                System.out.println("The created manual array is: " + Arrays.toString(manualArray));
                System.out.println("The same array sorted is: " + Arrays.toString(ArrayUtils.sortArray(manualArray, manualArray.length)));
                MinMaxPair minMax1 = ArrayUtils.getMinMax(manualArray);
                System.out.println(minMax1);
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }

    private static int[] createArray(Scanner sc) {
        int size;
        System.out.println("Please enter array length:");
        size = sc.nextInt();
        return new int[size];
    }
}