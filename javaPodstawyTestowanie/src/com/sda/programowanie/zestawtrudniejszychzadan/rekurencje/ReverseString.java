package com.sda.programowanie.zestawtrudniejszychzadan.rekurencje;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("test") + " should be " + "tset");
        System.out.println(reverseString("a") + " should be " + "a");
        System.out.println(reverseString("bartek czerwonka") + " should be " + "aknowrezc ketrab");
    }

    public static String reverseString(String text) {

        if (text.length() > 1) {
            return text.charAt(text.length() - 1) + reverseString(text.substring(0, text.length() - 1));
        } else {
            return text;
        }

    }

}
