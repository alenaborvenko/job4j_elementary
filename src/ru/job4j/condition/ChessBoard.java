package ru.job4j.condition;

public class ChessBoard {
    /**Метод вычисляющий на сколько ячеек походил слон (шахматной фигуры)
     *
     * @param x1 - x координата первой точки
     * @param y1 - у координата первой точки
     * @param x2 - ч координата второй точки
     * @param y2 - у координата второй точки
     * @return - x2-x1
     */
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)
                && (x1 >= 0 && x1 <= 7)
                && (x2 >= 0 && x2 <= 7)
                && (y1 >= 0 && y1 <= 7)
                && (y2 >= 0 && y2 <= 7)
            ) {
            result = Math.abs(x2 - x1);
        }
        return result;
    }
}
