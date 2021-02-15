package com.sda.zaawansowane.wstepoop.homework.inheritance.zadanie3;

public abstract class Shape {

    protected String color;
    protected boolean isColorFilled;

    public Shape() {
        this.color = "unknown";
        this.isColorFilled = false;
    }

    public Shape(String color, boolean isColorFilled) {
        this.color = color;
        this.isColorFilled = isColorFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isColorFilled() {
        return isColorFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setColorFilled(boolean colorFilled) {
        isColorFilled = colorFilled;
    }

    public abstract double getArea();

    public abstract double getPerimiter();

    public void printGeometry(){
        System.out.println("Area=" + getArea());
        System.out.println("Perimiter=" + getPerimiter());
        System.out.println("---------------------");
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + (isColorFilled ? "filled" : "not filled");
    }
}
