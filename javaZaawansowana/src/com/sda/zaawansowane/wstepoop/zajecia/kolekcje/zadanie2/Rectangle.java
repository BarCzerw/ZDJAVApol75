package com.sda.zaawansowane.wstepoop.zajecia.kolekcje.zadanie2;

import java.util.Objects;

public class Rectangle extends Figure{

    protected double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Rectangle w=" + width + " l=" + length + " | " + super.toString();
    }
}
