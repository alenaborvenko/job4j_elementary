package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void mondayThen1() {
        String in = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void mondayRusThen1() {
        String in = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void smthStringThenMinus1() {
        String in = "Hello";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, result);
    }
}