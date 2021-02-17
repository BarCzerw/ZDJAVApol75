package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie3;

public class Circle extends Figure{

    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
