package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumRsl1AndRsl2(double first, double  second) {
        return (first - second) + (first / second); // (first - second) + (first / second) можно записать как rsl1 + rsl2?
        //  class MathFunction я импортировала в данный класс, но смысл его импортировать, если значения не переносятся
    }

    public static void main(String[] args) {
        System.out.println(sumRsl1AndRsl2(10, 20));
    }
}
// в задании указано вычислить сумму четрыех операций, а их получается три
