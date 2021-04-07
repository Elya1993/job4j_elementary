package ru.job4j.condition;

public class Cinema2 {
    public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I go to the cinema");
        } else {
            System.out.println("I can not");
        }

    }

    public static void main(String[] args) {
        boolean one = true;
        boolean two = true;
        boolean three = true;
        boolean four = false;
        boolean five = false;
        boolean six = true;
        boolean seven = false;
        boolean eight = false;
        Cinema2.permission(one, two);
        Cinema2.permission(three, four);
        Cinema2.permission(five, six);
        Cinema2.permission(seven, eight);

    }

}
