package com.sda.programowanie.enumsy.zadanie1;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Weekday whichIsGreater(Weekday first, Weekday second){
        int result = first.compareTo(second);
        return result>=0 ? first : second;
    }

    public static boolean isWeekDay(Weekday day){
        return (day.ordinal()<=4);
    }

    public static boolean isHoliday(Weekday day){
        return !isWeekDay(day);
    }



}
