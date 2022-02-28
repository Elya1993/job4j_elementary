package ru.job4j.condition;

public class LogicNot {
    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && (num > 0);

    }

    public static boolean evenOrNotPositive(int num) {
        return (num % 2 == 0) || !(num > 0);

    }

    public static void main(String[] args) {
        LogicNot.notEvenAndPositive(4);

    }

}
