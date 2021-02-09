package com.sda.programowanie.zestawzadan.zadanie16;

import com.sda.programowanie.zestawzadan.UserArray;

import java.util.Arrays;

public class IncreasingSubarraySimpleSolution {

    static int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[] inputArray = UserArray.readArrayFromConsole(ARRAY_SIZE);
        System.out.println(Arrays.toString(inputArray));
        System.out.println(longestSubarray(inputArray, true));
        System.out.println(longestSubarray(inputArray, false));

    }

    private static int longestSubarray(int[] inputArray, boolean isAscending) {

        //reverse array if should search for descending
        if (!isAscending) {
            int temp;
            for (int i = 0; i < inputArray.length / 2; i++) {
                temp = inputArray[i];
                inputArray[i] = inputArray[inputArray.length - 1 - i];
                inputArray[inputArray.length - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(inputArray));
        }

        int longestSubarray = 1;
        int currentLength = 1;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] < inputArray[i + 1]) {
                currentLength++;
            } else {
                if (currentLength > longestSubarray) {
                    longestSubarray = currentLength;
                }
                currentLength = 1;
            }
        }

        //if last element was not higher/lower than previous
        if (currentLength > longestSubarray) {
            longestSubarray = currentLength;
        }

        return longestSubarray;
    }


}
