package com.sda.programowanie.zestawzadan.zadanie7;

import com.sda.programowanie.zestawzadan.Input;

import java.time.Duration;
import java.time.LocalTime;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Fibonacci {

    public static void main(String[] args) {

        timeCheck(Input.readInteger("Input integer: "));

    }

    public static void timeCheck(int n) {
        LocalTime start_rec = LocalTime.now();
        long fLoop = fibonacciLoop(n);
        System.out.println(ChronoUnit.MICROS.between(start_rec, LocalTime.now()));
        System.out.println(fLoop);
    }

    public static long fibonacciRecurrence(int n) {
        if (n > 2) {
            return fibonacciRecurrence(n - 1) + fibonacciRecurrence(n - 2);
        } else {
            return 1;
        }
    }

    public static long fibonacciLoop(int n) {

        long first = 1;
        long second = 1;

        if (n == 1) {
            return first;
        } else if (n == 2) {
            return second;
        } else {
            long nth = 0;
            n-=2;
            while (n-- > 0) {
                nth = first + second;
                first = second;
                second = nth;
            }
            return nth;
        }


    }

}
