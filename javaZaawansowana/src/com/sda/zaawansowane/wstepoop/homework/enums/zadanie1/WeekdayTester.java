package com.sda.zaawansowane.wstepoop.homework.enums.zadanie1;

public class WeekdayTester {

    public static void main(String[] args) {

        System.out.println(Weekday.isHoliday(Weekday.FRIDAY));
        System.out.println(Weekday.isWeekDay(Weekday.SUNDAY));

        System.out.println(Weekday.whichIsGreater(Weekday.MONDAY,Weekday.THURSDAY));
        System.out.println(Weekday.whichIsGreater(Weekday.SUNDAY,Weekday.TUESDAY));

        System.out.println(Weekday.whichIsGreater(Weekday.SATURDAY,Weekday.SATURDAY));
    }

}
