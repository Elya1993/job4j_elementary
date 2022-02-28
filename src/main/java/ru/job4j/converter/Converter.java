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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}

