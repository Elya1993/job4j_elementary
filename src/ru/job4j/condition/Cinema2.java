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
        Cinema2.permission(true, true);
        Cinema2.permission(true, false);
        Cinema2.permission(false, true);
        Cinema2.permission(false, false);
    }
}
