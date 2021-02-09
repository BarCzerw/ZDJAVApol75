package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean isContinue;
        do {
            isContinue = queue.readNextClient();
        } while (isContinue);
        queue.printAllRemainingClients();
    }

}
