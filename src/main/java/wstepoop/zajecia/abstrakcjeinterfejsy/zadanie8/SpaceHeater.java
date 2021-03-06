package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie8;

import wstepoop.zajecia.abstrakcjeinterfejsy.zadanie8.abstractclasses.Appliance;
import wstepoop.zajecia.abstrakcjeinterfejsy.zadanie8.interfaces.HeatsUp;

public class SpaceHeater extends Appliance implements HeatsUp {

    public SpaceHeater(double temperature) {
        super(temperature);
    }

    @Override
    public void heatUp() {
        System.out.println("Space heater - Raising temperature to " + (temperature+=0.05));
    }

}
