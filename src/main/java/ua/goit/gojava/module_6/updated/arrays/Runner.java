package ua.goit.gojava.module_6.updated.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // можно сказать, что здесь антишаблон копи-паст в sout'ах
        // по сути печатается один и тот же текст везде и меняется только печатаемый список
        // можно было бы вынести печать одинаковыъ кусков текста в отдельный метод
        // но мне кажется, в данном случае это ненужно усложнит задачу, кода и так уже достаточно много

        System.out.println("Please select: 1) create array randomly; 2) create array manually:");

        try {
            int choice = Integer.parseInt(sc.next());

            switch (choice) {
                case 1:
                    int[] randomArray = createArray(sc);
                    if (randomArray.length < 5) throw new TooSmallArrayException("[Warning] It will not be possible to sort such a small array. " +
                                "Array should contain at least 5 items");

                    randomArray = ArrayUtils.createRandomArray(randomArray);
                    System.out.println("The created random array is: " + Arrays.toString(randomArray));

                    randomArray = ArrayUtils.sortArray(randomArray);
                    System.out.println("The same array sorted is: " + Arrays.toString(randomArray));

                    MinMaxPair minMax = ArrayUtils.getMinMax(randomArray);
                    System.out.println(minMax);
                    break;
                case 2:
                    int[] manualArray = createArray(sc);

                    System.out.println("Please enter array elements:");
                    for (int i = 0; i < manualArray.length; i++) {
                        manualArray[i] = sc.nextInt();
                    }
                    System.out.println("The created manual array is: " + Arrays.toString(manualArray));

                    manualArray = ArrayUtils.sortArray(manualArray);
                    System.out.println("The same array sorted is: " + Arrays.toString(manualArray));

                    MinMaxPair minMax1 = ArrayUtils.getMinMax(manualArray);
                    System.out.println(minMax1);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("[Error] Make sure you enter a number");
        } catch (InputMismatchException e) {
            System.out.println("[Error] Make sure you enter integer numbers for array length and/or array items");
        } catch (TooSmallArrayException e) {
            System.out.println(e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println("[Error] Array cannot be of negative size");
        }
    }

    private static int[] createArray(Scanner sc) {
        System.out.println("Please enter array length:");
        int size = sc.nextInt();
        return new int[size];
    }
}