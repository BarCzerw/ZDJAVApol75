package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie4;

import com.sda.programowanie.zestawzadan.Input;

public class PhoneApp {

    public static void main(String[] args) {

        Phone nokia = new Phone();

        System.out.println("available commands - receive / erase / print");

        nokia.receiveMessage(123,"Hey!");
        nokia.receiveMessage(123,"What's up?");
        nokia.receiveMessage(456,"Notification about pending payment");
        nokia.receiveMessage(1111,"Alert");
        nokia.receiveMessage(1111,"Alert");
        nokia.receiveMessage(1111,"Alert");
        nokia.receiveMessage(1111,"Alert");

        while (true){
            nokia.readCommand();
        }
    }

}
