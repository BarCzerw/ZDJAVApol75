package wstepoop.homework.io.zadanie1;

import java.io.File;
import java.util.Scanner;

public class MainDirectory {

    public static void main(String[] args) {

        File dir = new File(readPathFromUser());
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static String readPathFromUser() {
        return new Scanner(System.in).nextLine();
    }

}
