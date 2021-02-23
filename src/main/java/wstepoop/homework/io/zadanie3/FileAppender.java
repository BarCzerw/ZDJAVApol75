package wstepoop.homework.io.zadanie3;

import podstawytestowanie.programowanie.zestawzadan.Input;
import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;

public class FileAppender {

    private static final String FILE_PATH = "matchResult.txt";

    public static void main(String[] args) {

        IOHelper.appendToFile(Paths.get(FILE_PATH), Input.readString("String to append:"));

    }

}
