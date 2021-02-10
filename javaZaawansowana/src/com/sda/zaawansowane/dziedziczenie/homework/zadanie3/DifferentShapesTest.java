package com.sda.zaawansowane.dziedziczenie.homework.zadanie3;

public class DifferentShapesTest {

    public static void main(String[] args) {

        Shape sh1 = new Shape();
        System.out.println(sh1);
        sh1.printGeometry();

        Circle c1 = new Circle();
        System.out.println(c1);
        c1.printGeometry();

        Circle c2 = new Circle("red",false,5.423);
        System.out.println(c2);
        c2.printGeometry();

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        r1.printGeometry();

        Rectangle r2 = new Rectangle("blue",true,7.4,0.68);
        System.out.println(r2);
        r2.printGeometry();

        Square s1 = new Square();
        System.out.println(s1);
        s1.printGeometry();

        Square s2 = new Square("green", true, 1.67);
        System.out.println(s2);
        s2.printGeometry();

    }

}
