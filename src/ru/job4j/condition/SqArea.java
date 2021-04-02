package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        double k = 2;
        int p = 6;
        double s = SqArea.square(p, k);
        System.out.println("Площадь треугольника равна" + s);
    }

}
