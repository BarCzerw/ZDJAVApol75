package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public class Czasopismo extends Egzemplarz{

    public Czasopismo(String tytul, int iloscStron) {
        super(tytul, iloscStron);
    }

    @Override
    public String toString() {
        return "Czasopismo " + super.toString();
    }
}
