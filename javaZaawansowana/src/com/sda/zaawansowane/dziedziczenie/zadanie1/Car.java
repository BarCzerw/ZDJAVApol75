package com.sda.zaawansowane.dziedziczenie.zadanie1;

public class Car {

    protected int speed;
    protected boolean isLightsOn;
    protected String color;
    protected String model;
    protected int year;


    public Car() {
        this("red", "Nissan Pulsar", 1989);
    }

    public Car(String color, String model, int year) {
        this(0, false, color, model, year);
    }

    private Car(int speed, boolean isLightsOn, String color, String model, int year) {
        this.speed = speed;
        this.isLightsOn = isLightsOn;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void accelerate() {
        if (speed == 120) {
            System.out.println("Already at max speed - " + speed + ".");
        } else {
            speed = Math.min(speed + 10, 120);
            System.out.println("Accelerating to " + speed + " km/h");
        }
    }

    public void switchLights() {
        if (!isLightsOn()) {
            System.out.println("Turning on lights.");
            isLightsOn = true;
        } else {
            System.out.println("Turning lights off.");
            isLightsOn = false;
        }
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    @Override
    public String toString() {
        return color + " car, model " + model + " of year " + year;
    }

    @Override
    public boolean equals(Object o) {
        if(o==this){return true;}
        if (o instanceof Car) {
            Car oCar = (Car) o;
            return this.year == oCar.year && oCar.color.equals(this.color) && oCar.model.equals(this.model);
        }
        return false;
    }

}
