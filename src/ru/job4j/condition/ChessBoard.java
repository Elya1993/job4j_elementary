package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int x2, int y1, int y2) {
        int rsl1 = Math.abs(x2 - x1);
        int rsl2 = Math.abs(y2 - y1);
        return rsl1 == rsl2 && (x1 >= 0) && (x1 <= 7) && (x2 >= 0) && (x2 <= 7) && (y1 >= 0) && (y1 <= 7) && (y2 >= 0) && (y2 <= 7) ? rsl1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(7, 0, 0, 7));
        System.out.println(ChessBoard.way(6, 1, 7, 2));
        System.out.println(ChessBoard.way(2, 4, 6, 1));
        System.out.println(ChessBoard.way(-1, 4, 6, 1));
        System.out.println(ChessBoard.way(2, 4, -1, 1));
        System.out.println(ChessBoard.way(2, -1, 6, 1));
        System.out.println(ChessBoard.way(2, 4, 6, -1));
        System.out.println(ChessBoard.way(10, 4, 6, 1));
        System.out.println(ChessBoard.way(2, 4, 10, 1));
        System.out.println(ChessBoard.way(2, 10, 6, 1));
        System.out.println(ChessBoard.way(2, 4, 6, 10));

    }
}


