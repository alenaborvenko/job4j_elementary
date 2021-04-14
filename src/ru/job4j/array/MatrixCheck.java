package ru.job4j.array;

public class MatrixCheck {
    /**
     * классический цикл for
     *         for (int cell = 0; cell < board.length; cell++) {
     *             if (board[row][cell] != 'X') {
     *                 result = false;
     *                 break;
     *             }
     *         }
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell:board[row]) {
            if (cell != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
