package com.sda.programowanie.zestawtrudniejszychzadan;

import java.util.Random;

public class Utility {

    public static int[] randomArray(int count, int bound){
        Random random = new Random();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i]=random.nextInt(bound);
        }
        return array;
    }

}
