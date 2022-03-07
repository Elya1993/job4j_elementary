package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double div(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println(MathFunction.sum(10, 20));
        System.out.println(MathFunction.minus(10, 20));
        System.out.println(MathFunction.div(10, 20));

    }
}

