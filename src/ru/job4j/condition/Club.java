package ru.job4j.condition;

public class Club {
    public static void permission (boolean befriend, boolean hasmoney) {
        if (befriend || hasmoney){
            System.out.println("I can go to the club");
        } else{
            System.out.println("I can not");
        }

    }
    public static void main(String[] args) {
        permission(true, false);
        permission(false, false);
        permission(true, true);
        permission(false, true);
    }

}
