package wstepoop.homework.io.zadanie4;

import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LongestStringFinder {

    private static final String FILE_PATH = "matchResult.txt";

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(IOHelper.readFromFiles(Paths.get(FILE_PATH)));
        String longest = "";
        for (String s : stringList) {
            String[] strings = s.split("\\s");
            for (String string : strings) {
                if (string.length() > longest.length()) {
                    longest = string;
                }
            }
        }

        System.out.println(longest);
    }
}
