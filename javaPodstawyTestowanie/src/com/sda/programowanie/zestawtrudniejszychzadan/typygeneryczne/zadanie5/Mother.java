package com.sda.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie5;

public class Mother implements IFamilyMember {
    private String name;
    private int age;

    public Mother() {
        this.name="";
        this.age=0;
    }

    public Mother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return "Mother " + this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
