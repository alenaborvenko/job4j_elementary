package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int ruble = 140;
        float expected = 2f;
        float rsl = Converter.rubleToEuro(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert200RblThen2point85Euro() {
        int ruble = 200;
        float expected = 2.85f;
        float rsl = Converter.rubleToEuro(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert0RblThen0Euro() {
        int ruble = 0;
        float expected = 0f;
        float rsl = Converter.rubleToEuro(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert900RblThen12point86Euro() {
        int ruble = 900;
        float expected = 12.86f;
        float rsl = Converter.rubleToEuro(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert140RblThen2point33Dlr() {
        int ruble = 140;
        float expected = 2.33f;
        float rsl = Converter.rubleToDollar(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert200RblThen3point33Dlr() {
        int ruble = 200;
        float expected = 3.33f;
        float rsl = Converter.rubleToDollar(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        int ruble = 0;
        float expected = 0f;
        float rsl = Converter.rubleToDollar(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }

    @Test
    public void whenConvert900RblThen15Dlr() {
        int ruble = 900;
        float expected = 15f;
        float rsl = Converter.rubleToDollar(ruble);
        Assert.assertEquals(expected, rsl, 1e-2);
    }
}