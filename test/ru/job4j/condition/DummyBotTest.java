package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest { // Все равно выдает
    // "Expected :Это ставит меня в тупик. Задайте другой вопрос
    //  Actual   :Как дела?
    //  Process finished with exit code -1"

    @Test
    public void whenAnswerPrivetBotThenPrivet() {
        String in = "Привет, Бот!";
        String out = DummyBot.answer(in);
        String expected = "Привет, умник!";
        Assert.assertEquals(expected, out);
    }


    @Test
    public void whenPoka() {
        String in = "Пока!";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи!";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Как дела?";
        String out = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос";
        Assert.assertEquals(expected, out);

    }

}