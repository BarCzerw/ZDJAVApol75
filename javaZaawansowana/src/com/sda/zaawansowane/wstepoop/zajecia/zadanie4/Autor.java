package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

import java.util.HashSet;
import java.util.Set;

public class Autor extends Czlowiek{

    private Egzemplarz[] egzemplarzList;
    private int egzemplarzCount;

    public Autor(String imie, String nazwisko) {
        super(imie, nazwisko);
        egzemplarzList = new Egzemplarz[100];
        egzemplarzCount=0;
    }

    public Egzemplarz[] getEgzemplarzList() {
        return egzemplarzList;
    }

    public int getEgzemplarzCount(){
        return egzemplarzCount;
    }

    public int getWszystkieStrony(){
        int result=0;
        for (int i = 0; i < egzemplarzCount; i++) {
            result+=egzemplarzList[i].getIloscStron();
        }
        return result;
    }

    public void dodajEgzemplarz(Egzemplarz e){
        egzemplarzList[egzemplarzCount++]=e;
    }

    public void wydrukujWszystkieEgzemplarze(){
        if(egzemplarzCount==0){
            System.out.println("Lista egzemplarzy jest pusta");
        }else {
            for (int i = 0; i < egzemplarzCount; i++) {
                System.out.println(egzemplarzList[i]);
            }
        }
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return "Autor " + super.toString();
    }
}
