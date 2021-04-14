package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then3() {
        int el = 5;
        int[] array = {0, 4, 3, 5, 1};
        int expected = 3;
        int rst = FindLoop.indexOf(array, el);
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenArrayHasNo9ThenMinus1() {
        int el = 9;
        int[] array = {5, 4, 3, 2, 1};
        int expected = -1;
        int rst = FindLoop.indexOf(array, el);
        Assert.assertEquals(expected, rst);
    }
}