package ua.goit.gojava.module_4.mathfunctions;

public class Distance {
    public static void main(String[] args) {

        // задаем координаты
        double x1 = 2, x2 = 7, y1 = 4, y2 = 13, distance;


        distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.println("расстояние между точками (х1, х2) и (у1, у2) равняется " + distance);


    }
}
