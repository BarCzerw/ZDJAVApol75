package com.sda.zaawansowane.dziedziczenie.homework.zadanie3;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(String color, boolean isColorFilled, double width) {
        super(color, isColorFilled, width, width);
    }

    @Override
    public String toString() {
        return "Square with width and length=" + width + " which is subclass of " + super.toString();
    }
}
