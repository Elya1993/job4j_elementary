package ru.job4j.condition;

public class Triangle {
    //Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
    //В этом задании нужно использовать булеву логику и оператор && (логическое и).
    public static boolean exist(double ab, double bc, double ac) {
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Triangle.exist(4, 5, 9);

    }
}
