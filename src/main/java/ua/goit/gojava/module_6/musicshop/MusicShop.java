package ua.goit.gojava.module_6.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicShop {

    Map<String, Integer> availableInShop = new HashMap<>();

    public Map<String, Integer> init() {
        availableInShop.put("guitar", 16);
        availableInShop.put("piano", 2);
        availableInShop.put("trumpet", 7);

        return availableInShop;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) throws AbsentInstrumentException {
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String instrumentType = entry.getKey();
            int instruments = entry.getValue();

            if (!availableInShop.containsKey(instrumentType)) throw new AbsentInstrumentException("shop does not contain " + instrumentType + "s");
            if (availableInShop.get(instrumentType) < instruments) throw new IllegalStateException("not enough instruments in the shop");
        }

        int guitars = order.get("guitar");
        int pianos = order.get("piano");
        int trumpets = order.get("trumpet");

        List<Instrument> toRemove = new ArrayList<>();
        for (int i = 0; i < guitars; i++) toRemove.add(new Guitar());
        for (int i = 0; i < pianos; i++) toRemove.add(new Piano());
        for (int i = 0; i < trumpets; i++) toRemove.add(new Trumpet());

        return toRemove;
    }

    public Map<String, Integer> leftInShop(Map<String, Integer> order) {
        availableInShop.put("guitar", availableInShop.get("guitar") - order.get("guitar"));
        availableInShop.put("piano", availableInShop.get("piano") - order.get("piano"));
        availableInShop.put("trumpet", availableInShop.get("trumpet") - order.get("trumpet"));

        return availableInShop;
    }
}