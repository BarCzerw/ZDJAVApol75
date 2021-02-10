package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public class Czlowiek {

    protected String imie;
    protected String nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getFullName(){
        return imie + " " + nazwisko;
    }


    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
