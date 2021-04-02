package ru.job4j.calculator;
   // Нужно дописать код, чтобы методы вычисляли идеальный вес для мужчины и женщины.
   //Вместо -1 вам нужно написать формулу приведенную выше.
public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double  womanWeight(short height) {
        double rsl1 = (height - 110) * 1.15;
        return rsl1;
    }
    public static void main(String[] args) {
        double manWeight = manWeight((short) 183);
        double womanWeight = womanWeight((short) 166);
        System.out.println("WomanWeight" + womanWeight);
        System.out.println("ManWeight" + manWeight);
    }

}