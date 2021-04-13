package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 4.0;
        double ac = 9.5;
        double bc = 5.2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}