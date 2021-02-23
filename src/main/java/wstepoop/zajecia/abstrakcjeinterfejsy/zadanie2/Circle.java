package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie2;

public class Circle {

    final protected static double PI=3.1415;
    protected double radius;

    /*final public Circle(double radius) {
        this.radius = radius; //ERROR not allowed here
    }*/

    public Circle(final double radius) {
        //radius*=2; ERROR because argument is final
        this.radius = radius;
    }

    final public double calculateArea(){
        return PI*radius*radius;
    }

    final public double calculateArea(boolean isPrecise){
        if (isPrecise){
            return calculateArea();
        }else {
            return 3*radius*radius;
        }
    }

}
