package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140RblThen2Dollar() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}