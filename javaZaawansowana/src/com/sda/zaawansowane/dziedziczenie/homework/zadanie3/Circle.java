package com.sda.zaawansowane.dziedziczenie.homework.zadanie3;

public class Circle extends Shape{

    protected double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String color, boolean isColorFilled, double radius) {
        super(color, isColorFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimiter(){
        return Math.PI*2*radius;
    }

    @Override
    public void printGeometry() {
        System.out.println("Radius="+radius);
        super.printGeometry();
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + " which is a subclass of " + super.toString();
    }
}
