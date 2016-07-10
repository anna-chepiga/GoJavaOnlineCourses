package ua.goit.gojava.module_5.main.java.updated;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    private static Scanner scanner = new Scanner(System.in);
    public static int min, max, arrayLength;
    private static int[] array;

    private static int[] createArray() {
        System.out.println("Please enter array length:");
        arrayLength = scanner.nextInt();
        return new int[arrayLength];
    }

    public static int[] randomArray() {
        array = createArray();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        minMaxPair(array);
        return array;
    }

    public static int[] manualArray() {
        array = createArray();
        System.out.println("Please enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        minMaxPair(array);
        return array;
    }

    private static void minMaxPair(int[] array) {
        max = array[0];
        min = array[0];
        for (int item : array) {
            if (item > max) max = item;
            if (item < min) min = item;
        }
    }

    public static int[] sortArray() {
        int[] sortedArray = Arrays.copyOf(array, arrayLength);
        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        return sortedArray;
    }
}