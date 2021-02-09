package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie2;

import java.time.LocalTime;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Queue {

    private final PriorityQueue<Client> queue = new PriorityQueue<>(Client::compareTo);

    public void addClient(String name, boolean isPriority) {
        queue.add(new Client(name, LocalTime.now(), isPriority));
    }

    public Client checkNextClient() {
        return queue.peek();
    }

    public Client getNextClient() {
        return queue.poll();
    }

    public void printAllRemainingClients() {
        while (!queue.isEmpty()){
            System.out.println(queue.poll().toString());
        }
    }

    public boolean readNextClient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Next client [Name, priority] or \"exit\": ");
        try {
            String name = input.next();
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting reading procedure");
                return false;
            }
            boolean isPriority = input.next().equalsIgnoreCase("yes");
            addClient(name, isPriority);
            return true;
        } catch (Exception e) {
            System.out.println("Error adding Client. Try again!");
            return false;
        }
    }

}
