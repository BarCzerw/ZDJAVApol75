package wstepoop.homework.io.zadanie6;

import wstepoop.homework.interfaces.zadanie2.Movie;

import java.io.IOException;

public class MovieCollectionMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MovieCollection mv = new MovieCollection("movies.txt");

        mv.addMovie(new Movie("Star Wars", 2005, "George Lucas"));
        mv.addMovie(new Movie("Matrix", 2003, "Wachowski"));
        mv.printMovies();
        mv.addMovie(new Movie("Rzniecie w tartaku", 2015, "Unknown"));
        mv.printMovies();
    }

}
