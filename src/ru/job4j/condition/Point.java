package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Math.pow((2) - (0), 2);
        double result2 = Math.pow((0) - (0), 2);
        double distance = Math.sqrt(result1 + result2);
       System.out.println(distance);
    }
}