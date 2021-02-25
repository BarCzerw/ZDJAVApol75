package wstepoop.homework.multithreading.zadanie3;

import java.util.Arrays;
import java.util.Random;

public class SortingMain {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bubbleSort(array);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                quickSort(array);
            }
        });

        t1.start();
        t2.start();

    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        System.out.println("Bubble done!");
    }

    public static void quickSort(int[] array){
        Arrays.sort(array);
        System.out.println("Quick done!");
    }

}

