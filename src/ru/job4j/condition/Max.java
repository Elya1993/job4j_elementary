package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean rsl = int left > int right ? "Число left больше числа right." : "Число left меньше числа right.";
        return rsl;

    }

    public static void main(String[] args) {
        int left = 5;
        int right = 10;
        int maximum = Max.max(5, 10);
        System.out.println(maximum);
    }
}
