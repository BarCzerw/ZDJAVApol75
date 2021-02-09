package com.sda.programowanie.dataiczas;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class DeathDateCalculator {

    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        LocalDate dateOfBirth = readDateOfBirth();
        String gender = readGender();
        boolean isSmoking = isSmoking();
        boolean isStressfulLife = isStressfulLife();

        System.out.println(calculateDateOfDeath(dateOfBirth, gender, isSmoking, isStressfulLife));

    }

    public static LocalDate readDateOfBirth() {

        System.out.print("Input date of birth [yyyy-MM-dd]: ");
        return LocalDate.parse( input.nextLine());
    }

    public static String readGender() {
            System.out.print("Input gender [m/f]: ");
            return input.nextLine();
    }

    public static boolean isSmoking() {
        System.out.print("Are you smoking? [y/n]: ");
        return (input.nextLine().equalsIgnoreCase("y"));
    }

    public static boolean isStressfulLife() {
        System.out.print("Are you living in a constant fear? [y/n]: ");
        return (input.nextLine().equalsIgnoreCase("y"));
    }

    public static LocalDate calculateDateOfDeath(LocalDate dateOfBirth, String gender, boolean isSmoking, boolean isStressfulLife) {

        if (isStressfulLife) {
            if (random.nextInt(100) < 10) {
                return dateOfBirth.plusYears(60);
            }
        }

        LocalDate end = dateOfBirth.plusYears(100);

        if (gender.equalsIgnoreCase("m")) {
            end = end.minusYears(10);
        }

        if (isSmoking) {
            end = end.minusYears(9).minusMonths(3);
        }

        return end;

    }

}
