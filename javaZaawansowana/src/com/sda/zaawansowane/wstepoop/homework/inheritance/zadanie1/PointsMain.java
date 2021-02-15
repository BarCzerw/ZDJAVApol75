package com.sda.zaawansowane.wstepoop.homework.inheritance.zadanie1;

public class PointsMain {

    public static void main(String[] args) {

        Point2D pnt2d = new Point2D();
        pnt2d.setXY(1.7f,-4.8f);
        System.out.println(pnt2d);

        Point3D pnt3d = new Point3D();
        pnt3d.setXYZ(pnt2d.getX(), pnt2d.getY(), 99.99f);
        System.out.println(pnt3d);

    }
}
