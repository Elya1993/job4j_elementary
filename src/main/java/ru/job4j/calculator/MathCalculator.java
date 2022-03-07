package ru.job4j.calculator;

public class MathCalculator {
    public static double sumOfMinusAndDiv(double first, double second) {
        return (first - second) + (first / second);
    }


    public static double rsl(double first, double second) {
        return ((first - second) + (first / second) + ((first - second) + (first / second)));
    }


    public static void main(String[] args) {
        System.out.println(MathCalculator.sumOfMinusAndDiv(10, 20));
        System.out.println(MathCalculator.rsl(10, 20));
    }
}
