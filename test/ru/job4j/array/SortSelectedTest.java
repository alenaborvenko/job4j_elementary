package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {9, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {45, 20, 4, 7, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 7, 8, 20, 45};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort7Numbers() {
        int[] data = new int[] {6, 3, 9, 0, -3, 9, -2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-3, -2, 0, 3, 6, 9, 9};
        Assert.assertArrayEquals(expected, result);
    }
}