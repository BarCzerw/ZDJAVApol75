package wstepoop.homework.inheritance.zadanie7;

public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimiter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle P=" + getPerimiter() + " - A=" + getArea();
    }
}
