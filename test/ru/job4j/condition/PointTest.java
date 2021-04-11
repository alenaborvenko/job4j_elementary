package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenX17Y11X23Y20Then4() {
        double expected = 4.1231;
        Assert.assertEquals(expected, Point.distance(7, 1, 3, 0), 1e-5);
    }

    @Test
    public void whenX12Y16X21Y25Then1() {
        double expected = 1.41421;
        Assert.assertEquals(expected, Point.distance(2, 6, 1, 5), 1e-5);
    }

    @Test
    public void whenX11Y16X22Y28Then2() {
        double expected = 2.23606;
        Assert.assertEquals(expected, Point.distance(1, 6, 2, 8), 1e-5);
    }
}