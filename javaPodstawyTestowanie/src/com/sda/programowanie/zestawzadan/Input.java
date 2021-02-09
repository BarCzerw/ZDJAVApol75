package com.sda.programowanie.zestawzadan;

import java.util.Scanner;

public class Input {

    static Scanner input = new Scanner(System.in);

    public static int readInteger(String text){
        System.out.print(text);
        return input.nextInt();
    }

    public static float readFloat(String text){
        System.out.print(text);
        return input.nextFloat();
    }

    public static double readDouble(String text){
        System.out.print(text);
        return input.nextDouble();
    }

    public static String readString(String text){
        System.out.print(text);
        return input.nextLine();
    }

    public static char readChar(String text){
        System.out.print(text);
        return input.nextLine().charAt(0);
    }

    public static String readNext(){
        return input.next();
    }

    public static void consumeNextLine(){
        input.nextLine();
    }

}
