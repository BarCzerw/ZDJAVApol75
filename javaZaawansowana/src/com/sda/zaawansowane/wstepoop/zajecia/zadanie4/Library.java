package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

import java.util.HashSet;
import java.util.Set;

public final class Library {

    private final Set<Copy> copies;
    private final Set<Author> authors;

    public Library() {
        copies = new HashSet<>();
        authors = new HashSet<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
        for (Copy copy : author.getCopies()) {
            copies.add(copy);
        }
    }

    public void addCopy(Copy copy) {
        copies.add(copy);
    }

    public Set<Copy> searchCopiesByTitle(String title) {
        Set<Copy> returnSet = new HashSet<>();

        for (Copy copy : copies) {
            if (copy.getTitle().toLowerCase().contains(title)) {
                returnSet.add(copy);
            }
        }

        return returnSet;
    }

    public Set<Copy> searchCopiesByAuthor(String author) {
        Set<Copy> returnSet = new HashSet<>();

        for (Author author1 : authors) {
            if (author1.getFullName().toLowerCase().contains(author)){
                returnSet.addAll(author1.getCopies());
            }
        }

        return returnSet;
    }

    public Set<Copy> searchCopiesByPhrase(String phrase) {
        Set<Copy> returnSet = new HashSet<>();

        returnSet.addAll(searchCopiesByTitle(phrase));
        returnSet.addAll(searchCopiesByAuthor(phrase));

        return returnSet;
    }

    public Author findAuthorOfMostTotalPages() {
        Author searchedAuthor = null;
        if (!authors.isEmpty()) {
            for (Author author : authors) {
                if (searchedAuthor == null) {
                    searchedAuthor = author;
                } else {
                    if (searchedAuthor.getTotalPagesWritten() < author.getTotalPagesWritten()) {
                        searchedAuthor = author;
                    }
                }
            }
        }
        return searchedAuthor;
    }

}
