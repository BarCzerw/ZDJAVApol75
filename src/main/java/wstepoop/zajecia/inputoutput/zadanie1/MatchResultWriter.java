package wstepoop.zajecia.inputoutput.zadanie1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MatchResultWriter {

    private static final Path FILE_PATH = Paths.get("matchResult.txt");

    public static void main(String[] args) {
        createFile();
        readMatches(3);
        printMatchesFromFile();
    }

    private static void createFile() {
        try {
            Files.createFile(FILE_PATH);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists! Clearing files.");
            try {
                Files.delete(FILE_PATH);
                createFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Error creating file!");
        }
    }

    private static void readMatches(int count) {
        for (int i = 0; i < count; i++) {
            Match match = new Match(TeamResultReader.read(), TeamResultReader.read());
            try {
                match.writeResultToFile(FILE_PATH);
            } catch (IOException e) {
                System.out.println("Error writing to file!");
            }
        }
    }

    private static void printMatchesFromFile() {
        try {
            for (String line : Files.readAllLines(FILE_PATH)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
