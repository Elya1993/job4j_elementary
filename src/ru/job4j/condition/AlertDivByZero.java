package ru.job4j.condition;

public class AlertDivByZero {   //Доработайте метод possibleDiv так, чтобы на консоль выводило строчку
    // "This is negative numbers", если число number меньше чем 0.
    public static void main(String[] args) {
        possibleDiv(-15);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");

        }
    }
}
