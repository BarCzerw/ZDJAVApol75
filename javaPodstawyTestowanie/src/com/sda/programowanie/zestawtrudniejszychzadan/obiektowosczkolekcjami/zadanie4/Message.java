package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

    private final String content;
    private final LocalDateTime arrived;

    public Message(String content) {
        this.content = content;
        this.arrived = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getArrived() {
        return arrived;
    }

    @Override
    public String toString() {
        return arrived.format(DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss")) + " " + content;
    }
}
