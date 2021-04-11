package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenCalcTest() {
        int[] a = {1, 0, 1, 1};
        int[] b = {1, 1, 1, 1};
        int[] c = {1, 1, 0, 1};
        int[] x = {1, 1, 1, 0};
        int[] expected = {3, 2, 2, 1};
        int[] resultCalcMethod = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            resultCalcMethod[i] = X2.calc(a[i], b[i], c[i], x[i]);
        }
        Assert.assertArrayEquals(expected, resultCalcMethod);
    }
}