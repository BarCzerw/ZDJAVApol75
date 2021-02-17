package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie2;

public class SpecificCircle extends Circle{

    public SpecificCircle(double radius) {
        super(radius);
    }

    /*@Override
    public double calculateArea(){
    //ERROR overridden method is final
    }*/

    /*public Circle(double radius){
        //ERROR no return type
        super(radius);
        this.radius *= 1.1;
    }*/

    public static void main(String[] args) {
        SpecificCircle sc = new SpecificCircle(6);
        System.out.println(sc.calculateArea());
        //SpecificCircle.PI=4; ERROR
    }
}
