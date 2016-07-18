package ua.goit.gojava.module_6.musicshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        MusicShop shop = new MusicShop();
        shop.availableInShop();

        System.out.println("initially the shop contains " + shop.availableInShop.toString() + "\n");

        //first order is ok
        Map<String, Integer> order1 = new HashMap<>();
        order1.put("guitar", 5);
        order1.put("piano", 1);
        order1.put("trumpet", 2);

        createOrder(shop, order1);

        // this order throws IllegalStateException, not enough instruments
        Map<String, Integer> order2 = new HashMap<>();
        order2.put("guitar", 4);
        order2.put("piano", 2);
        order2.put("trumpet", 3);

        createOrder(shop, order2);

        // this order throws AbsentInstrumentException, shop has no violins
        Map<String, Integer> order3 = new HashMap<>();
        order3.put("guitar", 7);
        order3.put("trumpet", 2);
        order3.put("violin", 5);
        order3.put("piano", 1);

        createOrder(shop, order3);
    }

    private static void createOrder(MusicShop shop, Map<String, Integer> order) {
        System.out.println("you have ordered: " + order.toString());

        try {
            List<Instrument> instrumentsToRemove = shop.prepareInstruments(order);
            System.out.println("removed instruments: " + instrumentsToRemove.size() + ", among them: " + order.toString());

            shop.leftInShop(order);
        } catch (IllegalStateException e) {
            System.out.println("not enough instruments in the shop");
        } catch (AbsentInstrumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("instruments left in the shop: " + shop.availableInShop.toString() + "\n");
    }
}