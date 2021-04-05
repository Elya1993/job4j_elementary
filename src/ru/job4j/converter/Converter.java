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
        int rsl = value * 70;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 200;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        int in1 = 200;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected == out;

        int in2 = 200;
        int expected2 = 12000;
        int out2 = Converter.dollarToRuble(in2);
        boolean passed2 = expected == out;

        int in3 = 200;
        int expected3 = 14000;
        int out3 = Converter.euroToRuble(in3);
        boolean passed3 = expected == out;

        System.out.println("200 рублей это два евро:" + passed);
        System.out.println("200 рублей это три доллара:" + passed1);
        System.out.println("200 долларов это 12000 рублей:" + passed2);
        System.out.println("200 евро это 14000 рублей:" + passed3);
    }
}

