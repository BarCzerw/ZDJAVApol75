package com.sda.programowanie.zestawzadan.zadanie19;

public class Author {

    final String name;
    final String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }

}
