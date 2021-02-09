package com.sda.programowanie.zestawzadan.zadanie15;

import com.sda.programowanie.zestawzadan.Input;
import com.sda.programowanie.zestawzadan.UserArray;

import java.util.Arrays;

public class DoubleFinder {

    static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] arr = UserArray.readArrayFromConsole(ARRAY_LENGTH);
        System.out.println("Input data: " + Arrays.toString(arr));
        System.out.println("Repeated data: " + Arrays.toString(repeatedDataArray(arr)));
    }

    public static int[] repeatedDataArray(int[] array){

        //tablica liczb, ktore sie powtarzaja, wstepnie ustawiona na dlugosc taka sama
        //jak array, counter liczy ile liczb zostalo wpisanych do repeatedArray
        int[] repeatedArray = new int[array.length];
        int counter = 0;

        //sprawdz kazda liczbe w array
        for (int i = 0; i < array.length; i++) {
            //i przyrownaj ja do kazdej wczesniejszej liczby
            for (int j = 0; j < i; j++) {
                //jesli sa takie same
                if (array[j]==array[i]){
                    //i nie ma juz takiej liczby w tablicy powtorzonych to wpisz do tablicy i zwieksz licznik
                    if (!contains(repeatedArray,array[j])){
                        repeatedArray[counter++]=array[j];
                    }
                }
            }
        }
        //zwraca kopie repeatedArray o indeksach od 0 do counter-1 (counter nie jest brany)
        return Arrays.copyOfRange(repeatedArray,0,counter);
    }

    //funkcja zwraca true jak znajdzie searchedNumber w array
    public static boolean contains(int[] array, int searchedNumber){
        for (int j : array) {
            if (j == searchedNumber) {
                return true;
            }
        }
        return false;
    }

}
