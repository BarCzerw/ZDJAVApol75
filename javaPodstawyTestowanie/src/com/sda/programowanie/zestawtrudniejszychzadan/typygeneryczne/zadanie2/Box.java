package com.sda.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie2;

public class Box<T> {

    private T element;

    public Box() {
        this.element=null;
    }

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean isEmpty(){
        return (element==null);
    }

}
