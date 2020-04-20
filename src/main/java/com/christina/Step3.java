package com.christina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Step3 {
    private Map<String, Integer> frequencies = new HashMap<>();

    public Step3() {
        frequencies.put("fizz", 0);
        frequencies.put("buzz", 0);
        frequencies.put("fizzbuzz", 0);
        frequencies.put("lucky", 0);
        frequencies.put("integer", 0);

    }

    static boolean isDigitPresent(int x, int check) {
        while (x > 0) {
            if (x % 10 == check) {
                break;
            }
            x = x / 10;
        }
        return (x > 0);
    }

    public static String convert(int i) {
        if (isDigitPresent(i, 3)) {
            return "lucky";
        } else if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else {
            return i + "";
        }
    }

    public int getFrequency(String a) {
        if (!frequencies.containsKey(a)){
            return 0;
        }
        else{
            return frequencies.get(a);
        }
    }

    public void convertRangeSum(int lower, int upper) {
        List<String> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            result.add(convert(i));
        }
        for (String i : result) {
            if (i.equals("lucky")) {
                Integer lucky = frequencies.get("lucky");
                frequencies.put("lucky", ++lucky);

            } else if (i.equals("fizz")) {
                Integer fizz = frequencies.get("fizz");
                frequencies.put("fizz", ++fizz);

            } else if (i.equals("buzz")) {
                Integer buzz = frequencies.get("buzz");
                frequencies.put("buzz", ++buzz);

            } else if (i.equals("fizzbuzz")) {
                Integer fizzbuzz = frequencies.get("fizzbuzz");
                frequencies.put("fizzbuzz", ++fizzbuzz);
            } else  {
                Integer integer = frequencies.get("integer");
                frequencies.put("integer", ++integer);
            }
        }

    }

    public void printCounters(int lower, int upper) {
        convertRangeSum(lower, upper);
        System.out.println(" fizz:" + frequencies.get("fizz") + " buzz:" + frequencies.get("buzz") + " fizzbuzz:" + frequencies.get("fizzbuzz") + " lucky:" + frequencies.get("lucky") + " integer:" + frequencies.get("integer"));
    }


}
