package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shidashen on 11/15/17.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float celsiusRoomTemp = ConverterUtil.convertFahrenheitToCelsius(212);
        float actual = 100;
        assertEquals(celsiusRoomTemp, actual, 0.001);
    }
    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float fahrenheit = ConverterUtil.convertCelsiusToFahrenheit(100);
        float actual = 212;
        assertEquals(fahrenheit, actual, 0.001);
    }

}
