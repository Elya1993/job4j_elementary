package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs7() {
        int x1 = 7;
        int x2 = 0;
        int y1 = 0;
        int y2 = 7;
        int rsl = ChessBoard.way(7, 0, 0, 7);
        int expected = 7;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void wayIs5() {
        int x1 = 6;
        int x2 = 1;
        int y1 = 7;
        int y2 = 2;
        int rsl = ChessBoard.way(6, 1, 7, 2);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way1Is0() {
        int x1 = 2;
        int x2 = 4;
        int y1 = 6;
        int y2 = 1;
        int rsl = ChessBoard.way(2, 4, 6, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way2Is0() {
        int x1 = -1;
        int x2 = 4;
        int y1 = 6;
        int y2 = 1;
        int rsl = ChessBoard.way(-1, 4, 6, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way3Is0() {
        int x1 = 2;
        int x2 = -1;
        int y1 = 4;
        int y2 = 1;
        int rsl = ChessBoard.way(2, -1, 4, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way4Is0() {
        int x1 = 2;
        int x2 = 6;
        int y1 = -1;
        int y2 = 1;
        int rsl = ChessBoard.way(2, 6, -1, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way5Is0() {
        int x1 = 2;
        int x2 = 6;
        int y1 = 4;
        int y2 = -1;
        int rsl = ChessBoard.way(2, 6, 4, -1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way6Is0() {
        int x1 = 10;
        int x2 = 6;
        int y1 = 4;
        int y2 = 1;
        int rsl = ChessBoard.way(10, 6, 4, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way7Is0() {
        int x1 = 2;
        int x2 = 10;
        int y1 = 4;
        int y2 = 1;
        int rsl = ChessBoard.way(2, 10, 4, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way8Is0() {
        int x1 = 2;
        int x2 = 6;
        int y1 = 10;
        int y2 = 1;
        int rsl = ChessBoard.way(2, 6, 10, 1);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
    @Test
    public void way9Is0() {
        int x1 = 2;
        int x2 = 6;
        int y1 = 4;
        int y2 = 10;
        int rsl = ChessBoard.way(2, 6, 4, 10);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }
}