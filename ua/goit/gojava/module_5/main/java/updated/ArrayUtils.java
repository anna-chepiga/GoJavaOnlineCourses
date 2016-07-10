package ua.goit.gojava.module_5.main.java.updated;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    private static Scanner scanner = new Scanner(System.in);
    public static int min, max;
    private static int[] array;

    private static int[] createArray() {
        System.out.println("Please enter array length:");
        int arraySize = scanner.nextInt();
        return new int[arraySize];
    }

    public static int[] randomArray() {
        array = createArray();
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        sortArray(array);
        minMaxPair(array);
        return array;
    }

    public static int[] manualArray() {
        array = createArray();

        System.out.println("Please enter array elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        sortArray(array);
        minMaxPair(array);
        return array;
    }

    private static void minMaxPair(int[] array) {
        max = array[0];
        min = array[0];

        for (int item : array) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }
    }

    private static void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}