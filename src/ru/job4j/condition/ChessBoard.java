package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}