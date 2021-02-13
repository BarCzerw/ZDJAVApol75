package com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces;

public interface TemperatureInformation {

    double getTemperature();
    default void printTemperature(){
        System.out.println("Current temperature - " + getTemperature() );
    };

}
