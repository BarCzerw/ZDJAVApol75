package com.sda.zaawansowane.wstepoop.zajecia.zadanie9;

import java.util.Arrays;

public class MainSortingStudents {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("Adam","Adamski",124967),
                new Student("Bartek","Bartkowski",134728),
                new Student("Celina","Celinska",114975),
                new Student("Dawid","Dawidowski",162485),
                new Student("Ewa","Ewska",139260),
                new Student("Filip","Filipski",139940),
                new Student("Gracjan","Gracjanski",172443),
                new Student("Henryk","Henrykowski",119788),
                new Student("Ilona","Ilonska",140060),
                new Student("Jan","Janski",129710),
        };

        System.out.println("Before sorting;");
        printStudents(students);

        System.out.println("\nAfter sorting:");
        Arrays.sort(students);
        printStudents(students);
    }

    public static void printStudents(Student[] students){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
