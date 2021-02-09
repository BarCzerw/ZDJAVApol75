package com.sda.programowanie.zestawzadan.zadanie14;

import com.sda.programowanie.zestawzadan.Input;

public class CharDifferenceCounter {

    public static void main(String[] args) {
        System.out.println(calculateCharsBetween(Input.readChar("First char: "), Input.readChar("Second char: ")));
    }

    public static int calculateCharsBetween(char a, char b) {
        //jezeli a i b to ten sam znak to nie ma miedzy nimi zadnego znaku
        if (a == b) {
            return 0;
        //odleglosc miedzy a i b to roznica w int minus 1 (a - b c d e - f)
        } else {
            return Math.abs((int) a - (int) b) - 1;
        }
    }
}
