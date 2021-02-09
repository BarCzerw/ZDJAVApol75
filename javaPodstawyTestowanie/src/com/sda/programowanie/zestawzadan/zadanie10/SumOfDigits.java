package com.sda.programowanie.zestawzadan.zadanie10;

import com.sda.programowanie.zestawzadan.Input;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = Input.readInteger("Number: ");
        Input.consumeNextLine();
        System.out.println("Sum of digits: " + sumOfDigits(num));

        String s = Input.readString("Number as string: ");
        System.out.println("Sum of digits: " + sumOfDigits(String.valueOf(s)));

    }

    private static long sumOfDigits(int num) {
        long sum = 0;
        while (num / 10 > 0) {
            sum += num%10;
            num/=10;
        }
        sum+=num;
        return sum;
    }

    private static long sumOfDigits(String s){
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum+=Long.parseLong(s.substring(i,i+1));
        }
        return sum;
    }

}
