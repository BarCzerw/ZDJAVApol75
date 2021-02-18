package com.sda.zaawansowane.wstepoop.homework.collections.zadanie2;

import java.util.*;

public class BookService {

    private Set<Book> bookSet = new HashSet<>();

    public boolean addBook(Book book) {
        return bookSet.add(book);
    }

    public boolean removeBook(Book book) {
        return bookSet.remove(book);
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public Set<Book> getBooksOfGenre(Genre genre) {
        Set<Book> books = new LinkedHashSet<>();

        for (Book book : bookSet) {
            if (book.getGenre() == genre) {
                books.add(book);
            }
        }
        return books;
    }

    public Set<Book> getBooksOfYearBefore(int year) {
        Set<Book> books = new LinkedHashSet<>();

        for (Book book : bookSet) {
            if (book.getYear() < year) {
                books.add(book);
            }
        }
        return books;
    }

    public Book getMostExpensiveBook() {
        float maxPrice = -1;
        Book mostExpensive = null;

        for (Book book : bookSet) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public Book getCheapestBook() {
        float minPrice = Float.MAX_VALUE;
        Book cheapest = null;

        for (Book book : bookSet) {
            if (book.getPrice() < minPrice) {
                minPrice = book.getPrice();
                cheapest = book;
            }
        }
        return cheapest;
    }

    public Set<Book> getBookOfMinimumAuthors(int authorsCount) {
        Set<Book> books = new LinkedHashSet<>();

        for (Book book : bookSet) {
            if (book.getAuthors().size() >= authorsCount) {
                books.add(book);
            }
        }
        return books;
    }

    public Set<Book> getSortedBookList(boolean isAscending) {
        int sortModifier = isAscending ? 1 : -1;

        Set<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortModifier * o1.getName().compareTo(o2.getName());
            }
        });
        books.addAll(bookSet);
        return books;
    }

    public boolean contains(Book book) {
        return bookSet.contains(book);
    }

    public Set<Book> getBooksOfAuthor(Author author) {
        Set<Book> books = new LinkedHashSet<>();

        for (Book book : bookSet) {
            if (book.getAuthors().contains(author)) {
                books.add(book);
            }
        }
        return books;
    }

    public void printAllBooks(){
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }

    public void printAllBooksAscending(){
        for (Book book : getSortedBookList(true)) {
            System.out.println(book);
        }
    }

    public void printAllBooksDescending(){
        for (Book book : getSortedBookList(false)) {
            System.out.println(book);
        }
    }

}
