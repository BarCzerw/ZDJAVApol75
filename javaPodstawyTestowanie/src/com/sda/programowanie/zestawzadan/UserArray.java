package com.sda.programowanie.zestawzadan;

import java.util.*;

public class UserArray {

    public static Scanner input = new Scanner(System.in);

    public static int[] readArrayFromConsole(int length) {
        int[] tempArray = new int[length];
        System.out.print("Input " + length + " number: ");
        for (int i = 0; i < length; i++) {
            tempArray[i] = Input.readInteger("");
        }
        Input.consumeNextLine();
        return tempArray;
    }

    public static int[] readArrayFromConsole() {
        List<Integer> arrayList = new ArrayList<>();

        while (input.hasNextInt()) {
            arrayList.add(input.nextInt());
        }

        int[] array = new int[arrayList.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

}
