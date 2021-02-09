package com.sda.programowanie.zestawzadan.zadanie9;

import com.sda.programowanie.zestawzadan.Input;

public class WaveGenerator {

    //wysokość fali, mozna dowolnie zmieniac
    static int WAVE_HEIGHT = 4;

    public static void main(String[] args) {

        int length = Input.readInteger("Length of wave: ");
        generateWave(length);

    }

    public static void generateWave(int length) {

        //tablica 2-wymiarowa boolean'ow - true jesli ma drukowac gwiazdke, false jesli spacje
        boolean[][] wave = new boolean[WAVE_HEIGHT][length];
        //czy kolejny znak ma byc w dol, czy w gore
        boolean isDescending = true;
        //czy dolny rzad ma byc 1-czy 2 znakowy
        boolean isBottomRowDouble = true;
        //czy pomijam zmiane poziomu
        boolean isLevelChanging = true;

        //aktualny poziom fali (od 0 do WAVE_HEIGHT-1)
        int level = 0;

        //petla przez dlugosc - length - podana przez uzytkownika
        for (int i = 0; i < length; i++) {

            //ustawienie poczatkowej wartosci na true
            isLevelChanging = true;

            //jezeli jestem na samym dole i isDescending, zmieniam isDescending na false
            if (level == WAVE_HEIGHT - 1 && isDescending) {
                isDescending = false;
                //dodatkowo jesli kolejny rzad ma byc podwojny, to nie zmieniam poziomu i ustawiam ze kolejny rzad nie ma byc podwojny
                if (isBottomRowDouble) {
                    isLevelChanging = false;
                    isBottomRowDouble = false;
                    //w innym przypadku ustawiam isBottomRowDOuble na true
                } else {
                    isBottomRowDouble = true;
                }
                //jezeli jestem na samej gorze i !isDescending to zmieniam isDescending na true
            } else if (level == 0 && !isDescending) {
                isDescending = true;
                isLevelChanging = false;
            }

            //ustawienie true w miejscu gdzie ma byc gwiazdka
            wave[level][i] = true;

            //jezeli isLevelChanging
            if (isLevelChanging) {
                //w gore lub w dol w zaleznosci od isDescending
                if (isDescending) {
                    level++;
                } else {
                    level--;
                }
            }
        }
        //wydruk fali
        printWave(wave);
    }

    public static void printWave(boolean[][] wave) {
        for (boolean[] booleans : wave) {
            System.out.println(boolArrayToString(booleans));
        }
    }

    public static String boolArrayToString(boolean[] boolArray) {
        //stringBuilderem tworze String skladajacy sie z "*" i " " w zaleznosci od boolArray
        StringBuilder s = new StringBuilder();
        for (boolean bool : boolArray) {
            s.append(bool ? "*" : " ");
        }
        return s.toString();
    }

}
