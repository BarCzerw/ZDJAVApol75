package com.sda.programowanie.dataiczas;

import java.time.*;

public class DateTimeTestingGround {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        System.out.println("Duration between now and minus 999 hours");
        System.out.println(Duration.between(now,now.minusHours(999)));

        System.out.println("Duration between now and minus -999 hours");
        System.out.println(Duration.between(now,now.minusHours(-999)));

        System.out.println(Period.between(today, LocalDate.of(2021, Month.DECEMBER,24)));

    }

}
