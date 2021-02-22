package com.sda.zaawansowane.wstepoop.homework.exceptions.zadanie1;

public class Main {

    public static void main(String[] args) throws CannotDivideBy0Exception {
        System.out.println(divide(124.235235,7245.2325345));
        System.out.println(divide(1,2));
        System.out.println(divide(0,2));
        System.out.println(divide(5,0));
    }

    public static double divide(double a, double b) throws CannotDivideBy0Exception {
        if (b==0){
            throw new CannotDivideBy0Exception();
        }else {
            return a/b;
        }
    }
}
