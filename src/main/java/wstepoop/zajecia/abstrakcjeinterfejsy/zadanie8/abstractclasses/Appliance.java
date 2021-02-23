package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie8.abstractclasses;

public abstract class Appliance {

    protected double temperature;

    public Appliance(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void printTemperature() {
        System.out.println("Current temperature - " + getTemperature());
    }
}
