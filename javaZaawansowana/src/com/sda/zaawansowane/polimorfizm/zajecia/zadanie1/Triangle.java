package com.sda.zaawansowane.polimorfizm.zajecia.zadanie1;

public class Triangle extends Figure{

    protected double a ,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*a*h;
    }
}
