package com.sda.zaawansowane.wstepoop.zajecia.zadanie8;

import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.abstractclasses.Appliance;
import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.CoolsDown;
import com.sda.zaawansowane.wstepoop.zajecia.zadanie8.interfaces.HeatsUp;

public class MainAppliances {

    public static void main(String[] args) {

        Appliance[] appliances = new Appliance[]{
                new SpaceHeater(23),
                new Fan(23),
                new AirConditioning(23)
        };

        for (int i = 0; i < 10; i++) {
            for (Appliance appliance : appliances) {
                if (appliance instanceof HeatsUp) {
                    ((HeatsUp) appliance).heatUp();
                }
            }
            System.out.println("-----------------");
        }

        for (int i = 0; i < 10; i++) {
            for (Appliance appliance : appliances) {
                if (appliance instanceof CoolsDown) {
                    ((CoolsDown) appliance).coolDown();
                }
            }
            System.out.println("-----------------");
        }

    }

}
