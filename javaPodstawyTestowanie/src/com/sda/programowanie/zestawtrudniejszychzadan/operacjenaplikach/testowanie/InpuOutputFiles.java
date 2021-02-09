package com.sda.programowanie.zestawtrudniejszychzadan.operacjenaplikach.testowanie;

import com.sda.programowanie.zestawzadan.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InpuOutputFiles {

    static String FILE_NAME = "./test.txt";
    static String TEST_STRING = "testowy string\npo \n";

    public static void main(String[] args) throws IOException {

        FileClass fc = new FileClass(FILE_NAME);
        fc.writeToFile(TEST_STRING);
        fc.writeToFile(Input.readString(""));
        fc.readFromFile();
        Input.readString("");
        fc.deleteFile();
    }

}
