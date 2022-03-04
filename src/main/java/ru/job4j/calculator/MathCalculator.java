package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumOfMinusAndDiv(double first, double second) {
        double sum2 = (first - second) + (first / second);
        return sum2;
    }

    public static double finish(double first, double second) {
        double finish = ((first - second) + (first / second) + ((first - second) + (first / second)));
        //почему вместо "(first - second)" я не могу написать просто переменную "minus1", которая в классе MathFunction
        //принимает значение "double minus1 = first - second"?
        //пример: double finish = minus1 + div1 + sum2

        return finish;

    }

    public static void main(String[] args) {
        System.out.println(MathCalculator.sumOfMinusAndDiv(10, 20));
        System.out.println(MathCalculator.finish(10, 20));

    }
}
