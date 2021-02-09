package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie4;

import com.sda.programowanie.zestawzadan.Input;

import java.time.Duration;
import java.util.*;

public class Phone {

    static Comparator<Message> cmpByArrival = new Comparator<Message>() {
        @Override
        public int compare(Message o1, Message o2) {
            return Duration.between(o1.getArrived(), o2.getArrived()).isZero() ? 0 : (Duration.between(o1.getArrived(), o2.getArrived()).isNegative() ? 1 : -1);
        }
    };

    private int number;
    Map<Integer, Inbox> phoneInbox = new HashMap<>();

    public int getNumber() {
        return number;
    }

    public void receiveMessage(int number, String content){
        if(!phoneInbox.containsKey(number)){
            phoneInbox.put(number,new Inbox());
        }
        phoneInbox.get(number).addMessage(content);
    }

    public List<Message> printMessagesFrom(int number){
        List<Message> messagesList = new ArrayList<>();
        if(phoneInbox.containsKey(number)){
            Inbox inbox = phoneInbox.get(number);
            inbox.printAllMessages();
            messagesList = inbox.getMessages();

        }else {
            System.out.println("No messages from number " + number);
        }
        return messagesList;
    }

    public Message eraseLastMessageFrom(int number) {
        Message temp = null;
        if (phoneInbox.containsKey(number)) {
            temp = phoneInbox.get(number).eraseOldestMessage();
        }else {
            System.out.println("No messages from " + number);
        }
        return temp;
    }

    public void readCommand(){
        String input = Input.readString("");
        int number;
        String content;
        switch (input){
            case "receive":
                number = Input.readInteger("Number: ");
                Input.consumeNextLine();
                content = Input.readString("Content: ");
                receiveMessage(number,content);
                break;
            case "print":
                number = Input.readInteger("Number: ");
                Input.consumeNextLine();
                printMessagesFrom(number);
                break;
            case "erase":
                number = Input.readInteger("Number: ");
                Input.consumeNextLine();
                eraseLastMessageFrom(number);
                break;
            default:
                System.out.println("No such command!");
        }
    }

}
