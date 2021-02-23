package wstepoop.zajecia.adnotations.maxlengthstring;

import java.util.Scanner;

public class StringReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readStringFromConsole() {
        return scanner.nextLine();
    }
}
