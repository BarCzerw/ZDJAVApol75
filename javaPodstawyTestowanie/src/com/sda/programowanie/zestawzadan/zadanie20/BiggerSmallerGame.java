package com.sda.programowanie.zestawzadan.zadanie20;

import com.sda.programowanie.zestawzadan.Input;

import java.util.Random;

public class BiggerSmallerGame {

    static Random RANDOM = new Random();
    static int NUMBER_TO_GUESS = RANDOM.nextInt(100)+1;

    public static void main(String[] args) {
        runGame();
    }

    public static boolean isGuessedExact(int number) {
        return number == NUMBER_TO_GUESS;
    }

    public static boolean isGuessedBigger(int number) {
        return number > NUMBER_TO_GUESS;
    }

    public static void runGame(){
        boolean numberGuessed = false;

        System.out.print("Guess the number (1-100): ");

        while (!numberGuessed){
            int inputNumber = Input.readInteger("");
            if (isGuessedExact(inputNumber)){
                numberGuessed=true;
                System.out.print("You guessed!");
            }else if(isGuessedBigger(inputNumber)){
                System.out.print("Nope! My number is smaller! Try again: ");
            }else {
                System.out.print("Nah... my number is bigger! Try again: ");
            }
        }
    }

}
