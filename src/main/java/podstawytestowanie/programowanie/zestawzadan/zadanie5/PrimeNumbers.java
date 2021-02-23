package podstawytestowanie.programowanie.zestawzadan.zadanie5;

import podstawytestowanie.programowanie.zestawzadan.Input;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = Input.readInteger("Number: ");

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
