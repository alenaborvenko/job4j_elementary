package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int tmp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = tmp;
        }
        return array;
    }
}
