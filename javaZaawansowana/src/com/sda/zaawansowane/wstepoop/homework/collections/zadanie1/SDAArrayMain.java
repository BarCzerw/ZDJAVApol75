package com.sda.zaawansowane.wstepoop.homework.collections.zadanie1;

public class SDAArrayMain {

    public static void main(String[] args) {

        SDAArrayList<Integer> integerList = new SDAArrayList<>();

        integerList.display();

        for (int i = 0; i < 20; i++) {
            System.out.println("Adding " + i + " to array");
            integerList.add(i);
            System.out.print("Current size - " + integerList.size() + " - ");
            integerList.display();
            System.out.println("------------------------------------------");
        }


        int[] indexToErase = new int[]{5,8,15,1,16};

        for (int i : indexToErase) {
            System.out.println("Removing index " + i + " from array - " + integerList.remove(i));
            System.out.print("Current size - " + integerList.size() + " - ");
            integerList.display();
            System.out.println("------------------------------------------");
        }

        Integer[] elementsToErase = new Integer[]{5,3,21};

        for (Integer i : elementsToErase) {
            System.out.println("Removing element " + i + " from array - " + integerList.remove(i));
            System.out.print("Current size - " + integerList.size() + " - ");
            integerList.display();
            System.out.println("------------------------------------------");
        }


    }


}
