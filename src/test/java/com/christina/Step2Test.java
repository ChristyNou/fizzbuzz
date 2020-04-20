package com.christina;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Step2Test {

    @Test
    public void isDigitPresent() {
        assertEquals(true,Step2.isDigitPresent(13, 3));
    }
    @Test
    public void is1Present(){
        assertEquals(true,Step2.isDigitPresent(81, 1));
    }
    @Test
    public void isNot5Present(){
        assertEquals(false,Step2.isDigitPresent(81, 5));
    }

    @Test
    public void convert() {
    }
    @Test
    public void check3() {
        assertEquals("lucky", Step2.convert(13));
    }

    @Test
    public void convertRangeEmptyList() {
        assertEquals(List.of(), Step2.convertRange(3, 2));
    }
    @Test
    public void convertRange1To3() {
        assertEquals(List.of("1","2","lucky"), Step2.convertRange(1, 3));
    }

    @Test
    public void convertRange1To20() {
        List<String> expected = List.of("1", "2", "lucky", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "lucky", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz");
        assertEquals(expected, Step2.convertRange(1, 20));
    }
}