package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }
    public static int euroToRuble(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(200);
        double dollar = Converter.rubleToDollar(200);
        int ruble = Converter.dollarToRuble(200);
        System.out.println("200 rubles are " + euro + " euro.");
        System.out.println("200 rubles are" + dollar + "dollar");
        System.out.println("200 dollar are" + ruble + "ruble");


    }
}

