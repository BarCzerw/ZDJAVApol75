package com.sda.zaawansowane.polimorfizm.zajecia.zadanie1;

public class Trapezoid extends Figure {

    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    protected double a, b, h;

    @Override
    public double getArea() {
        return (a+b)*h/2;
    }
}
