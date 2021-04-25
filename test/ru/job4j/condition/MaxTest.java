package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int first = 3;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3ThenAny() {
        int first = 3;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOutOfThree() {
        int first = 9;
        int second = 5;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOutOfFour() {
        int first = 9;
        int second = 5;
        int third = 2;
        int forth = 16;
        int result = Max.max(first, second, third, forth);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }
}