package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie4;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person {

    private Set<Copy> copies;

    public Author(String imie, String nazwisko) {
        super(imie, nazwisko);
        copies = new HashSet<>();
    }

    public Set<Copy> getCopies() {
        return copies;
    }

    public int getCopiesCount(){
        return copies.size();
    }

    public int getTotalPagesWritten(){
        int result=0;
        for (Copy copy : copies) {
            result+=copy.getPageCount();
        }
        return result;
    }

    public void addCopy(Copy e){
        copies.add(e);
    }

    public void printAllCopies(){
        for (Copy copy : copies) {
            System.out.println(copy);
        }
    }

    @Override
    public String toString() {
        return "Author " + super.toString();
    }
}
