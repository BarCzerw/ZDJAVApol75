package com.sda.zaawansowane.wstepoop.homework.zadanie2;

public class Lecturer extends Person{

    protected String specialization;
    protected float salary;

    public Lecturer(String specialization, float salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + specialization + " -> " + salary;
    }
}
