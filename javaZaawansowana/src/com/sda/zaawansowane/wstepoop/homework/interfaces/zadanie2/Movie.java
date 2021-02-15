package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie2;

public class Movie {

    private String title;
    private int productionYear;
    private String director;

    public static class MovieCreator{

        private String title;
        private int productionYear;
        private String director;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public Movie createMovie(){
            return new Movie(title,productionYear,director);
        }

    }

    public Movie(String title, int productionYear, String director) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", productionYear=" + productionYear +
                ", director='" + director + '\'' +
                '}';
    }
}
