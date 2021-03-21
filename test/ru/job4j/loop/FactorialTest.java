package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 7;
        int result = Factorial.calc(n);
        int expected = 5040;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 8;
        int result = Factorial.calc(n);
        int expected = 40320;
        assertEquals(expected, result);
    }
}