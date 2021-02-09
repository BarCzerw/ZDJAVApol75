package com.sda.programowanie.zestawtrudniejszychzadan.operacjenaplikach.testowanie;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileClass {

    private Path path;
    boolean fileCreated = false;

    public FileClass(Path path) {
        this.path = path;
        createFile();
    }

    private void createFile() {
        try {
            Files.createFile(path);
            fileCreated = true;
        } catch (IOException e) {
            System.out.println("Cannot create file!");
        }
    }

    public FileClass(String fileName) {
        try {
            this.path = Paths.get(fileName);
        } catch (Exception e) {
            System.out.println("Jakiś błąd, nie wiem co to");
        }
        createFile();
    }

    public void writeToFile(String text) {
        if (fileCreated) {
            try {
                Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Cannot write to file");
            }
        } else {
            System.out.println("File not created yet!");
        }

    }

    public void readFromFile() {
        if (fileCreated) {
            try {
                for (String line : Files.readAllLines(path)) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Cannot read from file");
            }
        } else {
            System.out.println("File not created yet!");
        }
    }

    public void deleteFile(){
        if (fileCreated){
            try {
                Files.delete(path);
            } catch (IOException e) {
                System.out.println("Cannot delete file!");
            }
        }else {
            System.out.println("File not created yet!");
        }
    }

}
