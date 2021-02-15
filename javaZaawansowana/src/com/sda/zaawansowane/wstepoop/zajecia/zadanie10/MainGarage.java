package com.sda.zaawansowane.wstepoop.zajecia.zadanie10;

public class MainGarage {

    public static void main(String[] args) {

        Garage<Car> myGarage = new Garage<>();

        BMW i8 = new BMW("i8","white");
        Porsche nineoneone = new Porsche("911", "yellow");
        BMW m3 = new BMW("M3", "blue");

        myGarage.parkCar(i8);
        myGarage.getCarOut(nineoneone);
        myGarage.parkCar(nineoneone);
        myGarage.parkCar(m3);

        Car currentCar = myGarage.getCarOut(i8);
        System.out.println(currentCar);

    }

}
