package ru.job4j.math;

public class MathFunction {

    public static double minus(double first, double second) {
        double rsl1 = (first - second);
        return rsl1;
    }
    public static double div(double first, double second) {
        double rsl2 = (first / second);
        return rsl2;
    }



    public static void main(String[] args) {
        System.out.println(minus(10, 20));
        System.out.println(div(10, 20));

    }
}

