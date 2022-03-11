package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2) - (x1), 2)) + (Math.pow((y2) - (y1), 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 2, 10, 2);
        double result3 = Point.distance(10, 8, 9, 8);
        double result4 = Point.distance(12, 4, 5, 4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}