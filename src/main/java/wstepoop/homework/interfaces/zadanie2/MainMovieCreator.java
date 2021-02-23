package wstepoop.homework.interfaces.zadanie2;

public class MainMovieCreator {

    public static void main(String[] args) {

        Movie starWarsIV = new Movie("New Hope",1977,"George Lucas");

        Movie mv = new Movie.MovieCreator()
                .setTitle("New Hope")
                .setProductionYear(1977)
                .setDirector("George Lucas")
                .createMovie();

        System.out.println("Both should print same mmovie");
        System.out.println(starWarsIV);
        System.out.println(mv);

    }

}
