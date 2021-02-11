package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public class Book extends Copy {

    public Book(String title, int pageCount) {
        super(title, pageCount);
    }

    @Override
    public String toString() {
        return "Book - " + super.toString();
    }
}
