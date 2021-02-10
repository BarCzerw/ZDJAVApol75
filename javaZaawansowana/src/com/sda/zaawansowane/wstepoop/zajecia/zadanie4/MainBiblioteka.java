package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public class MainBiblioteka {

    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();

        Autor a1 = new Autor("Adam","Mickiewicz");

        a1.dodajEgzemplarz(new Ksiazka("Dziady",450));
        a1.dodajEgzemplarz(new Ksiazka("Pan Tadeusz",780));
        a1.dodajEgzemplarz(new Ksiazka("Reduta Ordona",100));

        Autor a2 = new Autor("Richard","Ordon");

        a2.dodajEgzemplarz(new Ksiazka("Szaman", 780));
        a2.dodajEgzemplarz(new Czasopismo("Czasopismo o szamanie",48));

        Autor a3 = new Autor("Stefan","Zeromski");

        a3.dodajEgzemplarz(new Ksiazka("Ludzie bezdomni",120));
        a3.dodajEgzemplarz(new Ksiazka("Przedwiosnie",250));

        biblioteka.dodajAutora(a1);
        biblioteka.dodajAutora(a2);
        biblioteka.dodajAutora(a3);

        biblioteka.szukajPoTytule("a");
        biblioteka.szukajPoAutorze("zerom");
        biblioteka.szukajPoAutorzeLubTytule("ordon");
        System.out.println(biblioteka.znajdzAutoraONajwiekszymDorobku());

    }

}
