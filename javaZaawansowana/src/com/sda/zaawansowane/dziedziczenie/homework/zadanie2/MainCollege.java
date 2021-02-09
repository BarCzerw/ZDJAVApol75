package com.sda.zaawansowane.dziedziczenie.homework.zadanie2;

import java.util.Arrays;

public class MainCollege {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Adam","nowa 14");

        Student s1 = new Student("IT",2,12500f);

        Lecturer l1 = new Lecturer("IT",79800f);

        Person[] ppl = new Person[]{p1,p2,s1,l1};

        Arrays.stream(ppl)
                .forEach(System.out::println);

    }


}
