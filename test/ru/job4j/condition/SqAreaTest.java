package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        double p = 6.0;
        double k = 2.0;
        double expected = 2.0;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 1e-4);
    }

    @Test
    public void whenP3K7Square0() {
        double p = 3.0;
        double k = 7.0;
        double expected = 0.246;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 1e-4);
    }

    @Test
    public void whenP8K1Square4() {
        double p = 8.0;
        double k = 1.0;
        double expected = 4.0;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 1e-4);
    }
}