package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public class Ksiazka extends Egzemplarz{

    public Ksiazka(String tytul, int iloscStron) {
        super(tytul, iloscStron);
    }

    @Override
    public String toString() {
        return "Książka - " + super.toString();
    }
}
