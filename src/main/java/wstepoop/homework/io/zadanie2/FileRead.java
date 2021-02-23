package wstepoop.homework.io.zadanie2;

import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;

public class FileRead {

    private static final String FILE_PATH = "matchResult.txt";

    public static void main(String[] args) {

        IOHelper.printFile(Paths.get(FILE_PATH));
    }

}
