package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when12To102Then9() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 10;
        int y2 = 2;
        double expected = 9;
        double out = Point.distance(1, 2, 10, 2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when108To98Then1() {
        int x1 = 10;
        int y1 = 8;
        int x2 = 9;
        int y2 = 8;
        double expected = 1;
        double out = Point.distance(10, 8, 9, 8);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when124To54Then7() {
        int x1 = 12;
        int y1 = 4;
        int x2 = 5;
        int y2 = 4;
        double expected = 7;
        double out = Point.distance(12, 4, 5, 4);
        Assert.assertEquals(expected, out, 0.01);
    }
}