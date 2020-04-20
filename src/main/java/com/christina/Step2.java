package com.christina;

import java.util.ArrayList;
import java.util.List;

public class Step2 {

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

    public static List<String> convertRange(int lower, int upper) {
        List<String> result = new ArrayList<String>();
        for (int i = lower; i <= upper; i++) {
            result.add(convert(i));
        }
        return result;
    }
}
