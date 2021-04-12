package ru.job4j.condition;

public class LogicNot {
    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);

    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);

    }

    public static void main(String[] args) {
        LogicNot.notEvenAndPositive(4);

    }

}
