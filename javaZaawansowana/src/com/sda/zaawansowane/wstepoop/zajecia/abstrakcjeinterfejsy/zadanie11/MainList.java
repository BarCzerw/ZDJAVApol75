package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie11;

public class MainList {

    public static void main(String[] args) {

        MyList<Double> doubleList = new MyList<>(10);

        int counter = 1;
        boolean isFull;

        System.out.println("Current size - " + doubleList.size());

        do{
            System.out.println("------------------");
            System.out.println("Adding " + Math.PI/counter);
            isFull=!doubleList.addItem(Math.PI/counter++);
            System.out.println("Current size - " + doubleList.size());
        }while (!isFull);

        System.out.println(doubleList);

        System.out.println("Does contain PI/3 ?");
        System.out.println(doubleList.contains(Math.PI/3));

    }

}
