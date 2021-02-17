package com.sda.zaawansowane.wstepoop.zajecia.kolekcje.zadanie2;

public abstract class Figure implements Comparable<Figure>{

    public abstract double getArea();

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.getArea(),o.getArea());
    }

    @Override
    public String toString() {
        return "Figure Area=" + getArea();
    }

}
