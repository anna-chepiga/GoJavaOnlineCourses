package ua.goit.gojava.module_8;

import java.util.*;

public class Runner {

    private static BunchOfFlowers generalBunch = new BunchOfFlowers();
    private static Rosebush rosebush = new Rosebush();

    public static void main(String[] args) {

        // коллекция map обычная
        Map<String, Integer> bunch = new HashMap<>();

        bunch.put("roses", 5);
        bunch.put("tulips", 2);
        bunch.put("asters", 4);

        System.out.println("Map bunch: " + bunch + "\n");

        // коллекция map отсортированная
        // к заданию 2. Создать упорядоченный список объектов из ДЗ по теме OOP in Java, не прибегая к  использованию Collections.sort().
        Map<String, Integer> sortedBunch = new TreeMap<>();
        sortedBunch.put("roses", 7);
        sortedBunch.put("daisies", 5);
        sortedBunch.put("asters", 3);

        System.out.println("Sorted map bunch: " + sortedBunch + "\n");

        // коллекция list
        ArrayList<Flower> arrayListBunch = new ArrayList<>();
        arrayListBunch.add(new Aster("blue", 5, "asters"));
        arrayListBunch.add(new Rose("yellow", 4, "roses"));
        arrayListBunch.add(new Tulip("violet", 6, "tulips"));
        arrayListBunch.add(new Daisy("white", 2, "daisies"));

        generalBunch.setFlowersList(arrayListBunch);

        System.out.println("ArrayList bunch: " + arrayListBunch);

        // коллекция linked list для формирования букета роз
        List<Rose> bush = new LinkedList<>();
        bush.add(new Rose("red", 15, "roses"));

        rosebush.setNewRoseBush(bush);

        System.out.println("\nRosebush contains " + bush + "\n");

        // коллекции представленные в виде таблиц
        System.out.println("ArrayList bunch presented as table:");
        for (Flower element : arrayListBunch) {
            System.out.println(element.getAmount() + "\t" + element.getColour() + "\t" + element.getName());
        }

        System.out.println("\nMap bunch presented as table:");
        for (Map.Entry element : bunch.entrySet()) {
            System.out.println(element.getKey() + "\t" + element.getValue());
        }
    }
}