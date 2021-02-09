package com.sda.programowanie.zestawzadan.zadanie4;

import com.sda.programowanie.zestawzadan.Input;

public class PifPafLuckyLuck {

    static int d1 = 3;
    static int d2 = 7;

    public static void main(String[] args) {

        int num = Input.readInteger("Number");

        for (int i = 1; i <= num; i++) {

            if (i%(d1*d2)==0){
                System.out.println("Pif paf");
            }else if(i%d2==0){
                System.out.println("Paf");
            }else if(i%d1==0){
                System.out.println("Pif");
            }else {
                System.out.println(i);
            }

        }

    }

}
