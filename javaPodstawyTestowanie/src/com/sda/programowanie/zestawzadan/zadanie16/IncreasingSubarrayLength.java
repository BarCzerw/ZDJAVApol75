package com.sda.programowanie.zestawzadan.zadanie16;

import com.sda.programowanie.zestawzadan.UserArray;

import java.util.Arrays;

public class IncreasingSubarrayLength {

    /*algorytm
        - szukam wszystkich indeksow od ktorych sie moze zaczac ciag (index=0 oraz wszystkie te które a[i-1]>=a[i]
        - szukam wszystkich indeksow na ktorych sie moze skonczyc ciag (index=a.length-1 oraz wszystkie te ktore a[i+1]<a[i]
        - składam w jeden array, sortuje i szukam najwiekszej roznicy miedzy kolejnymi elementami + 1

        starting index     |->             |-> |->                       |->  |->

        index               0   1   2   3   4   5   6   7   8   9    10   11   12   13   14   15

        array               1   2   6   8   5   3   4   7   9   10   23   11   10   12   48   49

        ending index                   ->| ->| ->|                   ->|  ->|  ->|            ->|

        start+end           0 4 5 11 12 3 4 5 10 11 12 15
        sorted              0 3 4 4 5 5 10 11 11 12 12 15
        max diff (delta+1) = 6

     */

    public static void main(String[] args) {

        System.out.println("Input array of integers:");
        int[] array = UserArray.readArrayFromConsole();
        System.out.println(findLongestIncreasingSubarray(array));

    }

    public static int[] startingIndexes(int[] array) {
        int[] tempArray = new int[array.length];
        tempArray[0] = 0;
        int counter = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                tempArray[counter++] = i;
            }
        }
        return Arrays.copyOfRange(tempArray, 0, counter);
    }

    public static int[] endingIndexes(int[] array) {
        int[] tempArray = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                tempArray[counter++] = i;
            }
        }
        tempArray[counter++] = array.length - 1;
        return Arrays.copyOfRange(tempArray, 0, counter);
    }

    public static int findLongestIncreasingSubarray(int[] array) {

        int[] indexes = mergeTwoArrays(startingIndexes(array), endingIndexes(array));
        Arrays.sort(indexes);

        int longest = 0;

        for (int i = 0; i < indexes.length - 1; i++) {
            if ((indexes[i + 1] - indexes[i] + 1) > longest) {
                longest = (indexes[i + 1] - indexes[i] + 1);
            }
        }
        return longest;
    }

    public static int[] mergeTwoArrays(int[] first, int[] second) {
        int[] indexes = new int[first.length + second.length];
        int counter = 0;
        for (int j : first) {
            indexes[counter++] = j;
        }
        for (int j : second) {
            indexes[counter++] = j;
        }
        return indexes;
    }

}
