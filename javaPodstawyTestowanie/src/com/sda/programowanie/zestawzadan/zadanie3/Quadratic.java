package com.sda.programowanie.zestawzadan.zadanie3;

import com.sda.programowanie.zestawzadan.Input;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        int a = Input.readInteger("a:");
        int b = Input.readInteger("b:");
        int c = Input.readInteger("c:");

        double[] result = calculate(a,b,c);

        showResult(result);

    }

    private static void showResult(double[] result) {
        switch ((int) result[0]){
            case 2:
                System.out.println("Two solutions:");
                System.out.println(result[1]);
                System.out.println(result[2]);
                break;
            case 1:
                System.out.println("One solution:");
                System.out.println(result[1]);
                break;
            case 0:
                System.out.println("No solutions");
                break;
        }
    }

    private static double delta(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double[] calculate(int a, int b, int c) {

        double delta = delta(a, b, c);

        double count;
        double xOne;
        double xTwo;

        if (delta > 0) {
            count = 2;
            xOne = (-b - Math.sqrt(delta(a, b, c))) / (2 * a);
            xTwo = (-b + Math.sqrt(delta(a, b, c))) / (2 * a);
        } else if (delta == 0) {
            count = 1;
            xOne = (-b - Math.sqrt(delta(a, b, c))) / (2 * a);
            xTwo = Double.MIN_VALUE;
        } else {
            count = 0;
            xOne = xTwo = Double.MIN_VALUE;
        }
        return new double[]{count, xOne, xTwo};
    }

}
