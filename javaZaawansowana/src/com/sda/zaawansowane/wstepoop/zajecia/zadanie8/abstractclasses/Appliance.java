package com.sda.zaawansowane.wstepoop.zajecia.zadanie8.abstractclasses;

import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.TemperatureInformation;

public abstract class Appliance implements TemperatureInformation {

    protected double temperature;

    public Appliance(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}
