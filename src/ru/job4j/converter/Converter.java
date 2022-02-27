package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value1) {
        float rsl1 = value1 / 70;
        return rsl1;
    }

    public static float rubleToDollar(float value2) {
        float rsl2 = value2 / 60;
        return rsl2;
    }
    public static void main(String[] args) {
        float ruble1 = Converter.rubleToEuro(200);
        float ruble2 = Converter.rubleToDollar(200);
        System.out.println("200 рублей это " + ruble1 + " евро");
        System.out.println("200 рублей это " + ruble2 + " долларов");
    }
}

