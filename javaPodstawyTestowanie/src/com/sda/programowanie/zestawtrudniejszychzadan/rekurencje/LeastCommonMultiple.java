package com.sda.programowanie.zestawtrudniejszychzadan.rekurencje;

import java.util.Arrays;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        System.out.println("---LCM---");
        System.out.println(leastCommonMultiple(2, 3, 8) + " should be " + 24);
        System.out.println(leastCommonMultiple(1, 2) + " should be " + 2);
        System.out.println(leastCommonMultiple(2, 8, 4) + " should be " + 8);
        System.out.println(leastCommonMultiple(1, 2, 3, 4, 5, 6, 7, 8, 9) + " should be " + "dunno");
    }

    public static int leastCommonMultiple(int... numbers) {
        if (numbers.length > 2) {
            return leastCommonMultiple(numbers[0], leastCommonMultiple(Arrays.copyOfRange(numbers, 1, numbers.length)));
        } else {
            return (numbers[0] * numbers[1]) / leastCommonDivisor(numbers[0], numbers[1]);
        }
    }

    private static int leastCommonDivisor(int a, int b) {
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 & b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
