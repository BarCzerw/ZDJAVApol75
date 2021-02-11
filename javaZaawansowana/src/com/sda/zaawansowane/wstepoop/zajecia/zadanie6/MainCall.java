package com.sda.zaawansowane.wstepoop.zajecia.zadanie6;

public class MainCall {

    public static void main(String[] args) {

        Phone ajPhone = new Phone();

        for (int i = 0; i < 20; i++) {
            ajPhone.call(String.valueOf(2518*i+(978-36*i)));
        }
        for (int i = 0; i < 5; i++) {
            ajPhone.callEmergency();
        }


    }

}
