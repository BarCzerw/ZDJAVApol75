package com.sda.programowanie.zestawzadan.zadanie13;

import com.sda.programowanie.zestawzadan.Input;

public class YoYonkaua {

    public static void main(String[] args) {

        //wczytaj tekst od uzytkownika dzielac go spacjami i zapisujac do tablicy stringow
        String[] strings = Input.readString("Input string: ").split(" ");

        //stringbuilder i dolaczanie podwojonego slowa i spacji
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s + " " + s + " ");
        }

        //wypisanie string ze StringBuildera
        System.out.println(sb.toString());

    }
}
