package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie10;

public class Garage<T extends Car> {

    private T firstCar;
    private T secondCar;

    public Garage() {
        firstCar = null;
        secondCar = null;
    }

    public void parkCar(T car) {
        if (firstCar == null) {
            firstCar = car;
        } else if(secondCar==null) {
            secondCar = car;
        }else {
            System.out.println("No more space in garage!");
        }
    }

    public T getCarOut(T car){
        if (firstCar==car){
            firstCar=null;
            return car;
        }else if(secondCar==car){
            secondCar=null;
            return car;
        }else {
            System.out.println("No such car in garage!");
            return null;
        }
    }

}
