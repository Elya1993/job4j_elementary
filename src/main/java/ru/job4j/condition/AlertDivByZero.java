package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-15);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
        if (number == 0) {
            System.out.println("Could not div by 0");
        }
    }
}
