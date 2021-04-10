package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x2MinusX1 = x2 - x1, y2MinusY1 = y2 - y1;
        double powX = Math.pow(x2MinusX1, 2),
               powY = Math.pow(y2MinusY1, 2);
        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {
        double result = Point.distance(7, 1, 3, 0);
        System.out.println("result (7, 1) to (3, 0) is " + result);
        result = Point.distance(2, 6, 1, 5);
        System.out.println("result (2, 6) to (1, 5) is " + result);
        result = Point.distance(1, 6, 2, 8);
        System.out.println("result (1, 6) to (2, 8) is " + result);
    }
}
