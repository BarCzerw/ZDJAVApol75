package com.sda.zaawansowane.wstepoop.zajecia.zadanie2;

public class MainCircles {

    public static void main(String[] args) {

        final double finalRadius = 5.634;
        double radius = 4.532;

        SpecificCircle sc1 = new SpecificCircle(finalRadius);
        SpecificCircle sc2 = new SpecificCircle(radius);

        Circle c1 = new Circle(finalRadius);
        Circle c2 = new Circle(radius);
    }

}
