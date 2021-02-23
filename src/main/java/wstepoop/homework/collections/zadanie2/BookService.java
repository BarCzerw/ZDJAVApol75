package wstepoop.homework.collections.zadanie2;

import java.util.*;

public class BookService {

    private Set<Book> bookSet = new HashSet<>();

    public boolean addBook(Book book) {
        return bookSet.add(book);
    }

    public boolean removeBook(Book book) {
        return bookSet.remove(book);
    }

    public List<Book> getBookSet() {
        return new ArrayList<>(bookSet);
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

    public List<Book> getSortedBookList(boolean isAscending) {
        int sortModifier = isAscending ? 1 : -1;

        List<Book> books = new ArrayList<>(bookSet);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortModifier * o1.getName().compareTo(o2.getName());
            }
        });
        return books;
    }

    public boolean contains(Book book) {
        return bookSet.contains(book);
    }

    public List<Book> getBooksOfAuthor(Author author) {
        List<Book> books = new ArrayList<>();

        for (Book book : bookSet) {
            if (book.getAuthors().contains(author)) {
                books.add(book);
            }
        }
        return books;
    }

    //zadanie 4
    public Map<String, Genre> getMapOfBooks() {
        Map<String, Genre> map = new HashMap<>();

        for (Book book : bookSet) {
            map.put(book.getName(), book.getGenre());
        }
        return map;
    }

    //zadanie 5
    public List<Book> getBooksByValue(){
        List<Book> books = new ArrayList<>(bookSet);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return -Float.compare(o1.getPrice(),o2.getPrice());
            }
        });
        return books;
    }

}
