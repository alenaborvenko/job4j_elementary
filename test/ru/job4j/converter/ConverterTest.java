package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void convertRubleToEuroTest() {
        // массив для евро, после конвертации
        float[] expected = {2, 2.85f, 0, 0, 12.86f};
        // отрицательное количество рублей не может быть, если отрицательные рубли, то метод вернет 0
        // а может вызвать исключение (IllegalArgumentException)
        int[] rubles = {140, 200, 0, -1, 900};
        float[] resultConvertMethod = new float[rubles.length];
        for (int i = 0; i < rubles.length; i++) {
            resultConvertMethod[i] = Converter.rubleToEuro(rubles[i]);
        }
        Assert.assertArrayEquals(expected, resultConvertMethod, 1e-2f);
    }

    @Test
    public void convertRubleToDollar() {
        // массив для долларов, после конвертации
        float[] expected = {2.33f, 3.33f, 0, 0, 15f};
        // отрицательное количество рублей не может быть, если отрицательные рубли, то вернется из метода 0
        // а может вызвать исключение (IllegalArgumentException)
        int[] rubles = {140, 200, 0, -1, 900};
        float[] resultConvertMethod = new float[rubles.length];
        for (int i = 0; i < rubles.length; i++) {
            resultConvertMethod[i] = Converter.rubleToDollar(rubles[i]);
        }
        Assert.assertArrayEquals(expected, resultConvertMethod, 1e-2f);
    }
}