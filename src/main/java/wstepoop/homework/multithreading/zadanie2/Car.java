package wstepoop.homework.multithreading.zadanie2;

import wstepoop.homework.interfaces.zadanie3.CarType;

public class Car {

    private String name;
    private CarType type;

    public Car(String name, CarType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " " + type + " car";
    }
}
