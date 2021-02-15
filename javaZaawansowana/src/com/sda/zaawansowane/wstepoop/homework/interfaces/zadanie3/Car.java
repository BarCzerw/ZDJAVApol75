package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie3;

public class Car {

    private String name;
    private CarType carType;
    private Engine engine;

    public Car(String name, CarType carType) {
        this.name = name;
        this.carType = carType;
        engine = new Engine();
        engine.setEngine();
    }

    public class Engine{
        EngineType engineType;

        public void setEngine(){
            engineType=carType.getEngineType();
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType=" + engineType +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carType=" + carType +
                ", engine=" + engine +
                '}';
    }
}
