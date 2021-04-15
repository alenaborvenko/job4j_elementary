package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    /**
     * классический цикл for
     *         for (int cell = 0; cell < board[row].length; cell++) {
     *             if (board[row][cell] != 'X') {
     *                 result = false;
     *                 break;
     *             }
     *         }
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char elem :board[row]) {
            if (elem != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * классический цикл for
     *         for (int row = 0; row < board.length; row++) {
     *             if (board[row][column] != 'X') {
     *                 result = false;
     *                 break;
     *             }
     *         }
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }

    /**
     * выиграшная комбинация для игры сокобан. (либо в строке либо в столбце все 'X')
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diagonal = extractDiagonal(board);
        for (int i = 0; i < 5; i++) {
            if (diagonal[i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
