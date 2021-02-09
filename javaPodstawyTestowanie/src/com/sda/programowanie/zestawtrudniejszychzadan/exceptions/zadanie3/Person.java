package com.sda.programowanie.zestawtrudniejszychzadan.exceptions.zadanie3;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getFullname() {
        return name + " " + surname;
    }

    public int getAge() {
        return age;
    }
}
