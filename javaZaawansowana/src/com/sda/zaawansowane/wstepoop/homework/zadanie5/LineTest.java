package com.sda.zaawansowane.wstepoop.homework.zadanie5;

import com.sda.zaawansowane.wstepoop.homework.zadanie1.Point2D;

public class LineTest {

    public static void main(String[] args) {

        Point2D p1 = new Point2D(0,0);
        Point2D p2 = new Point2D(2,7);
        Point2D p3 = new Point2D(-6,3);

        Line l1 = new Line(p1,p2);
        Line l1Rev = new Line(p2,p1);

        Line l2 = new Line(p1,p3);
        Line l2Rev = new Line(p3,p1);

        Line l3 = new Line(p2,p3);
        Line l3Rev = new Line(p3,p2);

        System.out.println("Line 1");
        System.out.println(l1.getLength() + " - " + l1.getMiddlePoint());
        System.out.println(l1Rev.getLength() + " - " + l1Rev.getMiddlePoint());

        System.out.println("Line 2");
        System.out.println(l2.getLength() + " - " + l2.getMiddlePoint());
        System.out.println(l2Rev.getLength() + " - " + l2Rev.getMiddlePoint());

        System.out.println("Line 3");
        System.out.println(l3.getLength() + " - " + l3.getMiddlePoint());
        System.out.println(l3Rev.getLength() + " - " + l3Rev.getMiddlePoint());
    }

}
