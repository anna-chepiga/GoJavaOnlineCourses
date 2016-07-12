package ua.goit.gojava.module_6.distance;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter coordinates of the first point (x1 and x2): ");
            x1 = scan.nextDouble();
            x2 = scan.nextDouble();

            System.out.println("Please enter coordinates of the second point (y1 and y2): ");
            y1 = scan.nextDouble();
            y2 = scan.nextDouble();

            distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

            System.out.println("Distance between points (х1, х2) and (у1, у2) is " + distance);

        } catch (Exception e) {
            System.out.println("[Error]: Coordinates should be integer numbers");
        }
    }
}
