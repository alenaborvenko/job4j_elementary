package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        Assert.assertEquals(2.0, SqArea.square(6.0, 2.0), 1e-4);
    }

    @Test
    public void whenP3K7Square0() {
        Assert.assertEquals(0.246, SqArea.square(3.0, 7.0), 1e-4);
    }

    @Test
    public void whenP8K1Square4() {
        Assert.assertEquals(4.0, SqArea.square(8.0, 1.0), 1e-4);
    }
}