package com.sda.zaawansowane.wstepoop.zajecia.zadanie8;

import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.abstractclasses.Appliance;
import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.CoolsDown;

public class Fan extends Appliance implements CoolsDown {

    public Fan(double temperature) {
        super(temperature);
    }

    @Override
    public void coolDown() {
        System.out.println("Fan - Lowering temperature to " + (temperature-=0.05));
    }

}
