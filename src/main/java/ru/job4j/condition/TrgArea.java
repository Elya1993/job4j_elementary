package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double area = TrgArea.area(2, 2, 2);
        System.out.println("Площадь треугольника равна" + area);
    }
}
