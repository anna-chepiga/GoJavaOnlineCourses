package ua.goit.gojava.module_3.musicshop;

public abstract class Instrument {
    private final String GUITAR_PRICE = "10 USD";
    private final String PIANO_PRICE = "15 USD";

    public abstract String getType();

    public String getGUITAR_PRICE() {
        return GUITAR_PRICE;
    }

    public String getPIANO_PRICE() {
        return PIANO_PRICE;
    }

    public String getPrice(String aPrice) {
        return getType() + " price is: " + aPrice;
    }
}
