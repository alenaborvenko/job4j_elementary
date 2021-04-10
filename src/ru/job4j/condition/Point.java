package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x2MinusX1 = x2 - x1, y2MinusY1 = y2 - y1;
        double powX = Math.pow(x2MinusX1,2),
               powY = Math.pow(y2MinusY1,2);
        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {
        double result = Point.distance(7, 1, 3, 0);
        System.out.println("result (7, 1) to (3, 0) is " + result);
    }
}
