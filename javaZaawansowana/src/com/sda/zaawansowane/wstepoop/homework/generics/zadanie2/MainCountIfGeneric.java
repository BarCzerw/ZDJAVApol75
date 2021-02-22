package com.sda.zaawansowane.wstepoop.homework.generics.zadanie2;

public class MainCountIfGeneric {

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{2, 5, 4, 8, 9, 1, 3, 6, 7, 8, 2, 18, 2, 25, 15, 24, 36};

        System.out.println(countIf(integers, new CountIf<Integer>() {
            @Override
            public boolean isCountable(Integer element) {
                return element!=0 && element % 2 == 0;
            }
        }));

    }

    public static <T> int countIf(T[] array, CountIf<T> condition) {
        int counter = 0;
        for (T t : array) {
            if (condition.isCountable(t)) {
                counter++;
            }
        }
        return counter;
    }
}
