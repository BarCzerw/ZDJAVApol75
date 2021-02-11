package com.sda.zaawansowane.wstepoop.zajecia.zadanie6;

import java.util.Random;

public class Phone implements Calls {

    String phoneNumber;
    int totalCallTime;

    public Phone() {
        phoneNumber = "123-456-789";
    }

    private void callNumber(String number, int chanceOfAnswering, int maxCallLength){
        System.out.println("------------------------");
        System.out.println("Calling " + number);
        Random random = new Random();

        if (random.nextInt(100) > chanceOfAnswering){
            System.out.println("No answer...");
        }else {
            int callTime = random.nextInt(maxCallLength) + 1;
            totalCallTime += callTime;
            System.out.println("Call time " + callTime);
        }
        System.out.println();
        System.out.println("Total call time - " + totalCallTime);
    }

    @Override
    public void call(String number) {
        callNumber(number,80,60);
    }

    @Override
    public void callEmergency() {
        callNumber(Calls.emergencyNumber,100,3);
    }

}
