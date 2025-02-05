package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100to4Then100() {
        int left = 100;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax6to6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMaxThree() {
        int first = 6;
        int second = 9;
        int third = 16;
        int result = Max.max(first, second, third);
        int expected = 16;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMaxFourth() {
        int first = 6;
        int second = 9;
        int third = 16;
        int fourth = 20;
        int result = Max.max(first, second, third, fourth);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }
}