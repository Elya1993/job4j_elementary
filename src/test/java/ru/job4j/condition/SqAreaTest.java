package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenK5P10Square3point47() {
        int k = 5;
        int p = 10;
        double expected = 3.47;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenK15P12Square2point1() {
        int k = 15;
        int p = 12;
        double expected = 2.1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenK20P5Square0point28() {
        int k = 20;
        int p = 5;
        double expected = 0.28;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}