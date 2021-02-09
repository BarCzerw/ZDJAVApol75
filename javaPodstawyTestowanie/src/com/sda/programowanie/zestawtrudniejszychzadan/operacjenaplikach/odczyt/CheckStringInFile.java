package com.sda.programowanie.zestawtrudniejszychzadan.operacjenaplikach.odczyt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckStringInFile {

    static String FILE_PATH = "src/com/sda/programowanie/zestawtrudniejszychzadan/operacjenaplikach/odczyt/output_1.txt";

    public static void main(String[] args) {
        containsString(FILE_PATH, "check string");
    }

    public static boolean containsString(String filePathString, String s) {
        Path filePath = Paths.get(filePathString);
        if (!Files.isReadable(filePath)) {
            System.out.println("File is unreadable!");
            return false;
        } else {
            try {
                List<String> strings = Files.readAllLines(filePath);
                boolean stringFound = false;
                for (int i = 0; i < strings.size(); i++) {
                    if (strings.get(i).contains(s)) {
                        System.out.println("String found at line " + i);
                        stringFound=true;
                    }
                }
                if (!stringFound) {
                    System.out.println("String not found in file");
                    return false;
                }else {
                    return true;
                }
            } catch (IOException e) {
                System.out.println("Error reading file!");
                return false;
            }
        }
    }

}
