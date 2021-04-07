package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {
    @Test
    public void whenAnswerPrivetBotThenPrivet() {
        String in = "Привет, Бот!";
        String out = DummyBot.answer("Привет, умник!");
        String expected = "Привет, умник!";
        Assert.assertEquals(expected, out);
    } //не понимаю почему тест выдает "Это ставит меня в тупик. Задайте другой вопрос!",
    // хотя я везде все одинаково прописала


    @Test
    public void whenPoka() {
        String in = "Пока!";
        String result = DummyBot.answer("До скорой встречи!");
        String expected = "До скорой встречи!";
        Assert.assertEquals(expected, result);
    } // аналогично

}