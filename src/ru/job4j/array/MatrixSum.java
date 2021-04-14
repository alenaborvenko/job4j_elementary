package ru.job4j.array;

public class MatrixSum {
    /**
     *Т.к. в циклах нет манипуляций с индексами, то можно использовать foreach,где cell - элемент массива
     * классический цикл for
     * for (int row; row < array.length; row++) {
     *     for (int cell; cell < array[row].length; cell++) {
     *         sum += array[row][cell];
     *     }
     * }
     */
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int cell :row) {
                sum += cell;
            }
        }
        return sum;
    }
}
