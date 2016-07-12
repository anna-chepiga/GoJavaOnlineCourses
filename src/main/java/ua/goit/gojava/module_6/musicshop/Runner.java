package ua.goit.gojava.module_6.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        MusicShop shop = new MusicShop();
        shop.setGuitars(20);
        shop.setPianos(15);
        shop.setTrumpets(10);

        System.out.println(shop);

        Map<String, Integer> order = new HashMap<>();

        order.put("guitar", 10);
        order.put("piano", 10);
        order.put("trumpet", 15);

        try {
            List<Instrument> instrumentsToRemove = prepareOrder(shop, order);
            System.out.println("removed instruments: " + instrumentsToRemove.size());
        } catch (IllegalStateException e) {
            System.out.println("Not enough instruments in the shop");
        }

        System.out.println(shop);
    }

    private static List<Instrument> prepareOrder(MusicShop shop, Map<String, Integer> order) {
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrumpetsToRemove = order.get("trumpet");

        // антишаблон копипаст; можно заменить на один if с условием "или", например if(a<b || c<d || e<f)

        if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
        if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
        if (shop.getTrumpets() < numberOfTrumpetsToRemove) throw new IllegalStateException();

        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

        List<Instrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarsToRemove; i++) result.add(new Guitar());
        for (int i = 0; i < numberOfPianosToRemove; i++) result.add(new Piano());
        for (int i = 0; i < numberOfTrumpetsToRemove; i++) result.add(new Trumpet());

        return result;
    }
}
