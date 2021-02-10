package com.sda.zaawansowane.wstepoop.zajecia.zadanie1;

public class Cabrio extends Car{

    boolean isRoofClosed;

    public Cabrio() {
        super();
        isRoofClosed=false;
    }

    public Cabrio(String color, String model, int year) {
        super(color, model, year);
        isRoofClosed=false;
    }

    @Override
    public void accelerate(){
        if (speed == 180) {
            System.out.println("Already at max speed - " + speed + ".");
        } else {
            speed = Math.min(speed + 10, 180);
            System.out.println("Accelerating to " + speed + " km/h");
        }
    }

    public void switchRoof(){
        if(!isRoofClosed){
            System.out.println("Closing roof.");
            isRoofClosed=true;
        }else {
            System.out.println("Opening roof.");
            isRoofClosed=false;
        }
    }

    public boolean isRoofClosed(){
        return isRoofClosed;
    }

    @Override
    public String toString() {
        return super.toString() + " with opening roof";
    }
}
