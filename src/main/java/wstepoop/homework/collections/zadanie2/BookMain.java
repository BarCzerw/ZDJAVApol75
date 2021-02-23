package wstepoop.homework.collections.zadanie2;

import java.util.List;
import java.util.Map;

public class BookMain {

    static BookService BS = new BookService();

    public static void main(String[] args) {

        Author a1 = new Author("Olga", "Tokarczuk", "Female");
        Author a2 = new Author("Remigiusz", "Mróz", "Male");
        Author a3 = new Author("Katarzyna", "Bonda", "Female");
        Author a4 = new Author("Andrzej", "Sapkowski", "Male");

        Book b1 = new Book("Bieguni", 36.99f, 2008, Genre.PSYCHOLOGICAL);
        b1.addAuthor(a1);

        Book b2 = new Book("Ekspozycja", 44.99f, 2015, Genre.THRILLER);
        b2.addAuthor(a2);
        Book b3 = new Book("Przewieszenie", 43.99f, 2016, Genre.THRILLER);
        b3.addAuthor(a2);
        Book b4 = new Book("Trawers", 39.99f, 2016, Genre.THRILLER);
        b4.addAuthor(a2);

        Book b5 = new Book("Sprawa Niny Frank", 99.99f, 2007, Genre.PSYCHOLOGICAL);
        b5.addAuthor(a3);
        Book b6 = new Book("Tylko martwi nie kłamią", 79.99f, 2010, Genre.PSYCHOLOGICAL);
        b6.addAuthor(a3);

        Book b7 = new Book("Wiedźmin", 9.99f, 1990, Genre.FANTASY);
        b7.addAuthor(a4);
        Book b8 = new Book("Miecz przeznaczenia", 19.99f, 1993, Genre.FANTASY);
        b8.addAuthor(a4);
        Book b9 = new Book("Żmija", 9.99f, 2009, Genre.FANTASY);
        b9.addAuthor(a4);

        Book combinded1 = new Book("Combined a1,a2,a3,a4", 199.99f, 1989, Genre.ADVENTURE);
        combinded1.addAuthor(a1);
        combinded1.addAuthor(a2);
        combinded1.addAuthor(a3);
        combinded1.addAuthor(a4);

        Book combinded2 = new Book("Combined a1,a2,a3", 19.99f, 1998, Genre.THRILLER);
        combinded2.addAuthor(a1);
        combinded2.addAuthor(a2);
        combinded2.addAuthor(a3);

        Book combinded3 = new Book("Combined a1,a4", 259.99f, 1989, Genre.HISTORY);
        combinded3.addAuthor(a1);
        combinded3.addAuthor(a4);

        Book combinded4 = new Book("Combined a1,a3,a4", 45.99f, 1987, Genre.SCIENCE_FICTION);
        combinded4.addAuthor(a1);
        combinded4.addAuthor(a3);
        combinded4.addAuthor(a4);

        BS.addBook(b1);
        BS.addBook(b2);
        BS.addBook(b3);
        BS.addBook(b4);
        BS.addBook(b5);
        BS.addBook(b6);
        BS.addBook(b7);
        BS.addBook(b8);
        BS.addBook(b9);
        BS.addBook(combinded1);
        BS.addBook(combinded2);
        BS.addBook(combinded3);
        BS.addBook(combinded4);

        System.out.println("-------------ALL-BOOKS--------------");
        printList(BS.getBookSet());
        System.out.println("------------------------------------");

        System.out.println("-----------REMOVING-BOOK------------");
        BS.removeBook(b2);
        printList(BS.getBookSet());
        System.out.println("Adding again");
        BS.addBook(b2);
        System.out.println("------------------------------------");

        System.out.println("------------GET-ALL-BOOKS-----------");
        System.out.println(BS.getBookSet().size());
        System.out.println("------------------------------------");

        System.out.println("-----------GET-ALL-FANTASY----------");
        System.out.println(BS.getBooksOfGenre(Genre.FANTASY));
        System.out.println("------------------------------------");

        System.out.println("---------GET-ALL-BEFORE-1999--------");
        System.out.println(BS.getBooksOfYearBefore(1999));
        System.out.println("------------------------------------");

        System.out.println("----------GET-MOST-EXPENSIVE--------");
        System.out.println(BS.getMostExpensiveBook());
        System.out.println("------------------------------------");

        System.out.println("------------GET-CHEAPEST------------");
        System.out.println(BS.getCheapestBook());
        System.out.println("------------------------------------");

        System.out.println("--------GET-MINIMUM-3-AUTHORS-------");
        System.out.println(BS.getBookOfMinimumAuthors(3));
        System.out.println("------------------------------------");

        System.out.println("------GET-ALL-BOOKS-SORTED-ASC------");
        printList(BS.getSortedBookList(true));
        System.out.println("------------------------------------");

        System.out.println("------GET-ALL-BOOKS-SORTED-DESC-----");
        printList(BS.getSortedBookList(false));
        System.out.println("------------------------------------");

        System.out.println("---------DOES-CONTAIN-(TRUE)--------");
        Book dummyWiedzmin1 = new Book("Wiedźmin", 9.99f, 1990, Genre.FANTASY);
        dummyWiedzmin1.addAuthor(new Author("Andrzej", "Sapkowski", "Male"));
        System.out.println(BS.contains(dummyWiedzmin1));
        System.out.println("------------------------------------");

        System.out.println("---------DOES-CONTAIN-(FALSE)-------");
        Book dummyWiedzmin2 = new Book("Wiedźmin", 9.99f, 1991, Genre.FANTASY);
        dummyWiedzmin2.addAuthor(new Author("Andrzej", "Sapkowski", "Male"));
        System.out.println(BS.contains(dummyWiedzmin2));
        System.out.println("------------------------------------");

        System.out.println("---------DOES-CONTAIN-(FALSE)-------");
        Book dummyWiedzmin3 = new Book("Wiedźmin", 9.99f, 1990, Genre.FANTASY);
        dummyWiedzmin3.addAuthor(new Author("Andrzej", "Sapkow", "Male"));
        System.out.println(BS.contains(dummyWiedzmin3));
        System.out.println("------------------------------------");


        System.out.println("------------BOOKS-OF-AUTHOR---------");
        printList(BS.getBooksOfAuthor(new Author("Remigiusz", "Mróz", "Male")));
        System.out.println("------------------------------------");

        System.out.println("-------BOOKS-MAPPED-NAME>GENRE------");
        printMap(BS.getMapOfBooks());
        System.out.println("------------------------------------");

        System.out.println("--------BOOKS-SORTED-BY-PRICE-------");
        printList(BS.getBooksByValue());
        System.out.println("------------------------------------");
    }

    public static <E> void printList(List<E> list) {
        for (E e : list) {
            System.out.println(e);
        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> kvEntry : map.entrySet()) {
            System.out.println(kvEntry.getKey() + " - " + kvEntry.getValue());
        }
    }
}
