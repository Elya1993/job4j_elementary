package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        if (question.equals("Привет, Бот")) {
            System.out.println("Привет,умник!");
        }
        else if (question.equals("Пока")) {
            System.out.println("До скорой встречи!");
        } else {
            System.out.println("Это ставит меня в тупик. Задайте другой вопрос");
        }
        return question;
    }


    public static void main(String[] args) {
        DummyBot.answer("Привет, Бот");
    }
}
