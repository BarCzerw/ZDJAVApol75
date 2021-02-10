package com.sda.zaawansowane.wstepoop.zajecia.zadanie1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.switchLights();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.switchLights();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();

        System.out.println("----------------------------------------");

        Cabrio cabrio = new Cabrio();

        for (int i = 0; i < 20; i++) {
            cabrio.accelerate();
        }

        cabrio.switchRoof();
        cabrio.switchRoof();

        cabrio.switchLights();
        cabrio.switchLights();

    }

}
