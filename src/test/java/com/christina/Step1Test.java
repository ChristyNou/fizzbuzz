package com.christina;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class Step1Test {
    @Test
    public void itselfInteger() {
        assertEquals("1", Step1.convert(1));
    }

    @Test
    public void check3() {
        assertEquals("fizz", Step1.convert(3));
    }

    @Test
    public void check15() {
        assertEquals("fizzbuzz", Step1.convert(15));
    }

    @Test
    public void check5() {
        assertEquals("buzz", Step1.convert(5));
    }

    @Test
    public void value13() {
        assertEquals("13", Step1.convert(13));
    }

    @Test
    public void convertRangeWhenSingle() {
        List<String> expected = List.of("2");
        assertEquals(expected, Step1.convertRange(2, 2));
    }

    @Test
    public void convertWhenLowerGreaterUpper() {
        assertEquals(List.of(), Step1.convertRange(3, 2));
    }

    @Test
    public void convertRangeWhen1To3() {
        List<String> expected = List.of("1", "2", "fizz");
        assertEquals(expected, Step1.convertRange(1, 3));
    }

    @Test
    public void convertRangeWhen1To20() {
        List<String> expected = List.of("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz");
        assertEquals(expected, Step1.convertRange(1, 20));
    }


}
