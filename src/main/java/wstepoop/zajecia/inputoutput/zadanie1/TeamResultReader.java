package wstepoop.zajecia.inputoutput.zadanie1;

import java.util.Scanner;

public class TeamResultReader {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static TeamResult read() {
        System.out.println("New team result:");
        String[] result = SCANNER.nextLine().split(" ");
        if (result.length == 2) {
            return new TeamResult(result[0], Integer.parseInt(result[1]));
        } else if (result.length == 3) {
            return new TeamResult(result[0], Integer.parseInt(result[1]), Integer.parseInt(result[2]));
        } else {
            return null;
        }
    }

}
