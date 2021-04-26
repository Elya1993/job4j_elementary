package ru.job4j.condition;

public class MultipleSwitchWeek {


    public static int numberOfDay(String name) {
        int number = 0; // по названию дня недели нужно вывести его порядковый номер
        switch (name) {
            case "Понедельник", "Monday" -> {
                number = 1;
            }
            case "Вторник", "Tuesday" -> {
                number = 2;
            }
            case "Среда", "Wednesday" -> {
                number = 3;
            }
            case "Четверг", "Thursday" -> {
                number = 4;
            }
            case "Пятница", "Friday" -> {
                number = 5;
            }
            case "Суббота", "Saturday" -> {
                number = 6;
            }
            case "Воскресенье", "Sunday" -> {
                number = 7;
            }
        }
        return number;
    }
}
