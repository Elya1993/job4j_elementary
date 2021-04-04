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
        int expected1 = 2;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected == out;
        int in2 = 200;
        int expected2 = 1200;
        int out2 = Converter.dollarToRuble(in2);
        boolean passed2 = expected == out;
        int in3 = 200;
        int expected3 = 1200;
        int out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected == out;
        System.out.println("200 рублей это два евро:" + passed);
        System.out.println("200 рублей это два доллара:" + passed);
        System.out.println("200 долларов это 1200 рублей:" + passed);
        System.out.println("200 евро это 1400 рублей:" + passed);
    }
}

