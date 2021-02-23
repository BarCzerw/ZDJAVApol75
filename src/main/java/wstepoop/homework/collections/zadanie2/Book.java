package wstepoop.homework.collections.zadanie2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Book {

    private String name;
    private float price;
    private int year;
    private Set<Author> authors;
    private Genre genre;

    public Book(String name, float price, int year, Genre genre) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.genre = genre;
        authors = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + " - " + authors + " - " + year + " - " + genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        if (this.authors.size() != book.authors.size()) {
            return false;
        } else {
            for (Author author : this.authors) {
                if (!book.authors.contains(author)) {
                    return false;
                }
            }
            return Float.compare(book.price, price) == 0 && year == book.year && name.equals(book.name) && genre == book.genre;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, year, authors, genre);
    }
}
