package com.sda.programowanie.zestawtrudniejszychzadan.exceptions.zadanie4;

public class DateNotInFutureException extends Exception{

    public DateNotInFutureException() {
        System.err.println("Entered date not in future!");
    }
}
