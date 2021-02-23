package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie3;

public class Rectangle extends Figure{

    protected double a ,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
