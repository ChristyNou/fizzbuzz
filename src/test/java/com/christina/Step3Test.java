package com.christina;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Step3Test {

    @Test
    public void isDigitPresent() {
    }

    @Test
    public void convert() {
    }

    @Test
    public void checkFrequency() {
        Step3 step3 = new Step3();
        step3.convertRangeSum(1, 3);
        assertEquals(1,step3.getFrequency("lucky"));
        assertEquals(2,step3.getFrequency("integer"));
        assertEquals(0,step3.getFrequency("fizz"));
        assertEquals(0,step3.getFrequency("buzz"));
        assertEquals(0,step3.getFrequency("fizzbuzz"));
        assertEquals(0,step3.getFrequency("tiger"));
    }

    @Test
    public void convertRangeSum() {

    }
}