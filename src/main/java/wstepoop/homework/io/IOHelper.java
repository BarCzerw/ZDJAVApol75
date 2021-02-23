package wstepoop.homework.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IOHelper {

    public static void printFile(Path path) {
        try {
            System.out.println("Printing file " + path);
            for (String line : Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error printing file!");
        }
    }

    public static void appendToFile(Path path, String text) {
        try {
            Files.write(path, (text+"\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error appending to file!");
        }
    }

    public static void saveToFile(Path path, Collection<?> data) {
        try {
            Files.deleteIfExists(path);
            Files.createFile(path);
            for (Object o : data) {
                Files.write(path, (o.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.out.println("Error saving file!");
        }
    }

    public static List<String> readFromFiles(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error reading from file!");
            return new ArrayList<>();
        }
    }

}
