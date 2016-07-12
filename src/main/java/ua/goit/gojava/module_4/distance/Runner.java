package ua.goit.gojava.module_4.distance;

public class Runner {
    private static Coordinates coordinates = new Coordinates();

    public static void main(String[] args) {

        try {
            readCoordinates();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Error] please make sure you enter *two* numbers and try again\n");
            readCoordinates();
        } catch (NumberFormatException e) {
            System.out.println("[Error] please make sure you enter a number and try again\n");
            readCoordinates();
        }
    }

    private static void readCoordinates() {
        System.out.println("Please enter the coordinates of first point divided by space or new line");
        coordinates.setX1();
        coordinates.setY1();

        System.out.println("\nAnd coordinates of the second point:");
        coordinates.setX2();
        coordinates.setY2();

        System.out.println("\nThe distance between the points is " + coordinates.calculateDistance());
    }
}
