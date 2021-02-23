package wstepoop.homework.inheritance.zadanie3;

public class Rectangle extends Shape{

    protected double width, length;

    public Rectangle() {
        super();
        this.width=1;
        this.length=1;
    }

    public Rectangle(String color, boolean isColorFilled, double width, double length) {
        super(color, isColorFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimiter() {
        return 2*(width+length);
    }

    @Override
    public void printGeometry() {
        System.out.println("Width="+width);
        System.out.println("Length="+length);
        super.printGeometry();
    }

    @Override
    public String toString() {
        return "Rectangle with width=" + width + " and length=" + length + " which is subclass of " + super.toString();
    }
}
