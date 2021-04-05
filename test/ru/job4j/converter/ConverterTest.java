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
    public void whenConvert200RubleTo2Dollar() {
        int in = 200;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert200DollarTo12000Ruble() {
        int in = 200;
        int expected = 12000;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert200EuroTo14000Ruble() {
        int in = 200;
        int expected = 14000;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}