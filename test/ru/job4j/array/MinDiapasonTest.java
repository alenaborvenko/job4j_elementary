package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void firstMin() {
        int start = 1;
        int finish = 4;
        int[] array = new int[] {0, 1, 3, 2, 5, 5};
        int expected = 1;
        int rst = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void lastMin() {
        int start = 1;
        int finish = 4;
        int[] array = new int[] {0, 5, 3, 2, 0, 5};
        int expected = 0;
        int rst = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void middleMin() {
        int start = 1;
        int finish = 4;
        int[] array = new int[] {0, 7, 3, 2, 5, 5};
        int expected = 2;
        int rst = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, rst);
    }
}