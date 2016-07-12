package ua.goit.gojava.module_4.distance;

import java.util.Scanner;

public class Coordinates {

    private double x1, x2, y1, y2;
    private static final Scanner sc = new Scanner(System.in);

    public void setX1() {
        this.x1 = Double.parseDouble(sc.next());
    }

    public void setX2() {
        this.x2 = Double.parseDouble(sc.next());
    }

    public void setY1() {
        this.y1 = Double.parseDouble(sc.next());
    }

    public void setY2() {
        this.y2 = Double.parseDouble(sc.next());
    }

    public double calculateDistance() {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}