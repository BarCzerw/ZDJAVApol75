package com.sda.programowanie.zestawzadan.zadanie19;

public class Poem {

    final Author writter;
    final int stropheCount;

    public Poem(Author writter, int stropheCount) {
        this.writter = writter;
        this.stropheCount = stropheCount;
    }

    public int getStropheCount() {
        return stropheCount;
    }

    public Author getAuthor() {
        return writter;
    }

}
