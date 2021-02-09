package com.sda.programowanie.zestawtrudniejszychzadan.exceptions.zadanie3;

public class NoAdultException extends Exception{
    public NoAdultException(Person person) {
        System.err.println(person.getFullname() +" is not an adult");
    }
}
