package com.sda.zaawansowane.wstepoop.zajecia.zadanie8;

import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.abstractclasses.Appliance;
import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.CoolsDown;
import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.HeatsUp;

public class AirConditioning extends Appliance implements CoolsDown, HeatsUp {

    public AirConditioning(double temperature) {
        super(temperature);
    }

    @Override
    public void coolDown() {
        System.out.println("AC - Lowering temperature to " + (temperature-=0.1));
    }

    @Override
    public void heatUp() {
        System.out.println("AC - Raising temperature to " + (temperature+=0.1));
    }
}
