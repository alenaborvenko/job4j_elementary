package ru.job4j.array;

public class Matrix {
    /**
     * Матрица квадратная, поэтому количество строк = количеству столбцов = size
     */
    public static int[][] multiple(int size) {
        int[][] multipleMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multipleMatrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return multipleMatrix;
    }
}
