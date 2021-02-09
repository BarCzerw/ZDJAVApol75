package com.sda.programowanie.zestawzadan.zadanie2;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Mass:");
            float mass = input.nextFloat();
            System.out.print("Height:");
            int height = input.nextInt();

            if (mass > 0 && height > 0) {
                float bmi = calculate(mass, height);
                System.out.println((bmi >= 18.5 && bmi <= 24.9) ? "BMI optymalne" : "BMI nieoptymalne");
            } else {
                System.out.println("Mass and height cannot be negative!");
            }

        } catch (Exception e) {
            System.out.println("Error reading data from input!");
        }

    }

    public static float calculate(float mass, int height) {
        return (float) (mass / Math.pow((float) height / 100, 2));
    }

}
