package ua.goit.gojava.module_3.musicshop;

public class Runner {
    public static void main(String[] args) {

        Guitar myGuitar = new Guitar();
        Piano myPiano = new Piano();

        System.out.println(myGuitar.getPrice(myGuitar.getGUITAR_PRICE()) + "\n" + myPiano.getPrice(myGuitar.getPIANO_PRICE()));


    }
}
