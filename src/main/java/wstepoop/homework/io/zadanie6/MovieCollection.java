package wstepoop.homework.io.zadanie6;

import wstepoop.homework.interfaces.zadanie2.Movie;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieCollection {

    private String filePath;

    public MovieCollection(String fileName) throws IOException {
        this.filePath = fileName;
        createFile();
    }

    public void printMovies() throws IOException, ClassNotFoundException {
        for (Movie mv : readMoviesFromFile()) {
            System.out.println(mv);
        }
    }

    private List<Movie> readMoviesFromFile() throws IOException, ClassNotFoundException {
        if (!isFileEmpty()) {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (List<Movie>) ois.readObject();
        } else {
            return new ArrayList<>();
        }
    }

    private void writeMoviesToFile(List<Movie> movies) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(movies);
    }

    public void addMovie(Movie movie) throws IOException, ClassNotFoundException {
        List<Movie> movies = readMoviesFromFile();
        movies.add(movie);
        writeMoviesToFile(movies);
    }

    private boolean fileExists() {
        Path path = Paths.get(filePath);
        return Files.exists(path);
    }

    private boolean isFileEmpty() throws IOException {
        return new File(filePath).length()==0;
    }

    private void createFile() throws IOException {
        Files.deleteIfExists(Paths.get(filePath));
        Files.createFile(Paths.get(filePath));
    }

}
