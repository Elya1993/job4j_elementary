package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) { // почему стринг с большой буквы
        if ("Привет, Бот.".equals(question)) {
           String  rsl = "Привет, умник";
        } else if ("Пока.".equals(question)) {
           String  rsl = "До скорой встречи.";
        } else {
           String  rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return (question);
    }


    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}
