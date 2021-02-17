package com.sda.zaawansowane.wstepoop.zajecia.kolekcje.zadanie2;

import java.util.Objects;

public class Square extends Figure{

    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }

    @Override
    public String toString() {
        return "Square w=" + width + " | " + super.toString();
    }
}
