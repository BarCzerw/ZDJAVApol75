package com.sda.zaawansowane.dziedziczenie.homework.zadanie2;

public class Student extends Person{

    protected String degree;
    protected int year;
    protected float costYearly;

    public Student(String degree, int year, float costYearly) {
        this.degree = degree;
        this.year = year;
        this.costYearly = costYearly;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCostYearly() {
        return costYearly;
    }

    public void setCostYearly(float costYearly) {
        this.costYearly = costYearly;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + degree + " -> year " + year + " -> " + costYearly;
    }
}
