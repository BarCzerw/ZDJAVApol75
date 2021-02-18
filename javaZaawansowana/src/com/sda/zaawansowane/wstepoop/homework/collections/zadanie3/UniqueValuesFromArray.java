package com.sda.zaawansowane.wstepoop.homework.collections.zadanie3;

import java.util.*;

public class UniqueValuesFromArray {

    public static Random RANDOM = new Random();
    public static int RANGE = 51;
    public static int COUNT = 100;


    public static void main(String[] args) {

        Integer[] intArray = new Integer[COUNT];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=RANDOM.nextInt(RANGE);
        }

        System.out.println(uniqueItems(intArray));
        System.out.println(duplicatedItems(intArray));

    }

    public static <E> List<E> uniqueItems(E[] array) {
        return new LinkedList<>(new HashSet<>(Arrays.asList(array)));
    }

    public static <E> List<E> duplicatedItems(E[] array) {
        List<E> duplicated = new LinkedList<>(Arrays.asList(array));
        for (E uniqueItem : uniqueItems(array)) {
            duplicated.remove(uniqueItem);
        }
        return new LinkedList<>(new HashSet<>(duplicated));
    }

}
