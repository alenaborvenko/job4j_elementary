package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void array1234Then4321() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] rst = Turn.back(array);
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void array4321Then1234() {
        int[] array = {4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4};
        int[] rst = Turn.back(array);
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void array4162Then2614() {
        int[] array = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        int[] rst = Turn.back(array);
        Assert.assertArrayEquals(expected, rst);
    }

    @Test
    public void array7381020018Minus35Then5Minus31802010837() {
        int[] array = {7, 3, 8, 10, 20, 0, 18, -3, 5};
        int[] expected = {5, -3, 18, 0, 20, 10, 8, 3, 7};
        int[] rst = Turn.back(array);
        Assert.assertArrayEquals(expected, rst);
    }
}