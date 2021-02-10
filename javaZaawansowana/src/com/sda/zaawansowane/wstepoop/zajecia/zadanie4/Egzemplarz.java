package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public abstract class Egzemplarz {

    protected String tytul;
    protected int iloscStron;

    public Egzemplarz(String tytul, int iloscStron) {
        this.tytul = tytul;
        this.iloscStron = iloscStron;
    }

    public String getTytul() {
        return tytul;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    @Override
    public String toString() {
        return tytul + " - " + iloscStron;
    }
}
