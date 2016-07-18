package ua.goit.gojava.module_6.musicshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicShop {

    Map<String, Integer> availableInShop = new HashMap<>();

    public Map<String, Integer> availableInShop() {
        availableInShop.put("guitar", 16);
        availableInShop.put("piano", 2);
        availableInShop.put("trumpet", 7);

        return availableInShop;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) throws AbsentInstrumentException {
        for(Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String instrumentType = orderEntry.getKey();
            int numberOfInstrumentsToRemove = order.get(instrumentType);

            if (!availableInShop.containsKey(instrumentType)) throw new AbsentInstrumentException("shop does not contain " + instrumentType + "s");
            if (availableInShop.get(instrumentType) < numberOfInstrumentsToRemove) throw new IllegalStateException();
        }

        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrumpetsToRemove = order.get("trumpet");

        List<Instrument> instrumentsToRemove = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarsToRemove; i++) instrumentsToRemove.add(new Guitar());
        for (int i = 0; i < numberOfPianosToRemove; i++) instrumentsToRemove.add(new Piano());
        for (int i = 0; i < numberOfTrumpetsToRemove; i++) instrumentsToRemove.add(new Trumpet());

        return instrumentsToRemove;
    }

    public Map<String, Integer> leftInShop(Map<String, Integer> order) {
        availableInShop.put("guitar", availableInShop.get("guitar") - order.get("guitar"));
        availableInShop.put("piano", availableInShop.get("piano") - order.get("piano"));
        availableInShop.put("trumpet", availableInShop.get("trumpet") - order.get("trumpet"));

        return availableInShop;
    }
}