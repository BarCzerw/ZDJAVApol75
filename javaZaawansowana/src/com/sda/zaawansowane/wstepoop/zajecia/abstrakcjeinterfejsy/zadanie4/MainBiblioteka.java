package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie4;

public class MainBiblioteka {

    public static void main(String[] args) {

        Library biblioteka = new Library();

        Author a1 = new Author("Adam", "Mickiewicz");

        a1.addCopy(new Book("Dziady", 450));
        a1.addCopy(new Book("Pan Tadeusz", 780));
        a1.addCopy(new Book("Reduta Ordona", 100));

        Author a2 = new Author("Richard", "Ordon");

        a2.addCopy(new Book("Szaman", 780));
        a2.addCopy(new Magazine("Czasopismo o szamanie", 48));

        Author a3 = new Author("Stefan", "Zeromski");

        a3.addCopy(new Book("Ludzie bezdomni", 120));
        a3.addCopy(new Book("Przedwiosnie", 250));

        biblioteka.addAuthor(a1);
        biblioteka.addAuthor(a2);
        biblioteka.addAuthor(a3);

        System.out.println("Searching copies by title \"a\"");
        System.out.println(biblioteka.searchCopiesByTitle("a"));
        System.out.println("----------------------------------");

        System.out.println("Searching copies by author \"zerom\"");
        System.out.println(biblioteka.searchCopiesByAuthor("zerom"));
        System.out.println("----------------------------------");

        System.out.println("Searching copies by phrase \"ordon\"");
        System.out.println(biblioteka.searchCopiesByPhrase("ordon"));
        System.out.println("----------------------------------");

        System.out.println("Find author of most pages written");
        System.out.println(biblioteka.findAuthorOfMostTotalPages());
        System.out.println("----------------------------------");
    }

}
