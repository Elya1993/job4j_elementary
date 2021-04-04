package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert200RblThen2Euro() {
        int in = 200;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void rubleToDollar() {
    }

    @Test
    public void dollarToRuble() {
    }

    @Test
    public void euroToRuble() {
    }
}