package wstepoop.zajecia.kolekcje.zadanie3;

import java.util.*;

public class MainLottoGame {

    public static Scanner SCANNER = new Scanner(System.in);
    public static Random RANDOM = new Random();

    public static void play() {
        Set<Integer> playerNumbers = readPlayerNumbers();
        Set<Integer> gameNumbers = drawGameNumbers();

        int result = getResult(playerNumbers, gameNumbers);

        System.out.println("PLayer numbers: " + playerNumbers);
        System.out.println("Game numbers: " + gameNumbers);
        System.out.println("Numbers guessed: " + result);
    }

    private static Set<Integer> readPlayerNumbers() {

        Set<Integer> playerNumbers = new TreeSet<>();

        while (playerNumbers.size() < 6) {
            System.out.print("Input number: ");
            String input = SCANNER.nextLine();
            Scanner dummy = new Scanner(input);
            while (dummy.hasNextInt()) {
                int number = dummy.nextInt();
                if (number > 0 && number < 50 & playerNumbers.size()<6) {
                    playerNumbers.add(number);
                }else {
                    break;
                }
            }
        }

        return playerNumbers;
    }

    private static Set<Integer> drawGameNumbers() {

        Set<Integer> drawnNumbers = new TreeSet<>();

        while (drawnNumbers.size() < 6) {
            drawnNumbers.add(RANDOM.nextInt(49) + 1);
        }

        return drawnNumbers;
    }


    private static int getResult(Set<Integer> playerNumbers, Set<Integer> drawnNumbers) {
        int result = 0;

        for (Integer drawnNumber : drawnNumbers) {
            if (playerNumbers.contains(drawnNumber)) {
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        play();
    }

}
