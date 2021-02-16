package com.sda.zaawansowane.wstepoop.zajecia.kolekcje.zadanie1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListMethods {

    public static void main(String[] args) {

        List<Character> characterList = new LinkedList<>();
        characterList.add('a');
        characterList.add('a');
        characterList.add('a');
        characterList.add('b');
        characterList.add('c');
        characterList.add('c');
        characterList.add('c');
        characterList.add('c');
        characterList.add('c');
        characterList.add('d');
        characterList.add('e');
        characterList.add('f');
        characterList.add('f');
        characterList.add('g');

        System.out.println("Initial list\n" + characterList);

        System.out.println("Duplicates:");
        printDuplicates(characterList);

        System.out.println("Duplicated items\n" + getDuplicated(characterList));

        removeDuplicates(characterList);
        System.out.println(characterList);

    }

    public static <E> void printDuplicates(List<E> list) {
        System.out.println(getDuplicates(list));
    }

    private static <E> List<E> getDuplicates(List<E> list) {
        List<E> duplicates = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            E currentElement = list.get(i);
            if (list.indexOf(currentElement)!=i && list.indexOf(currentElement)!=list.lastIndexOf(currentElement)){
                duplicates.add(currentElement);
            }
        }

        return duplicates;
    }

    private static <E> List<E> getDuplicated(List<E> list){
        List<E> duplicated = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            E currentElement = list.get(i);
            if (!duplicated.contains(currentElement) && list.indexOf(currentElement)!=i && list.indexOf(currentElement)!=list.lastIndexOf(currentElement)){
                duplicated.add(currentElement);
            }
        }

        return duplicated;
    }

    public static <E> void removeDuplicates(List<E> list) {
        //list.removeAll(getDuplicates(list)); //usuwa wszystkie wystapienia elementow, a nie tylko duplikaty

        for (E duplicate : getDuplicates(list)) {
            list.remove(duplicate);
        }

    }

}
