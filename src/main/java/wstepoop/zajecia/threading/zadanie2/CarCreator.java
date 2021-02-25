package wstepoop.zajecia.threading.zadanie2;

import wstepoop.homework.interfaces.zadanie3.CarType;

import java.util.Random;

public class CarCreator {

    public static Car create(){
        Random random = new Random();
        return new Car(String.valueOf(random.nextInt(2000000)), CarType.values()[random.nextInt(3)]);
    }
}
