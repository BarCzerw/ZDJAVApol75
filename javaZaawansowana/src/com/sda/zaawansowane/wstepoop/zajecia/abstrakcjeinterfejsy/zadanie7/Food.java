package com.sda.zaawansowane.wstepoop.zajecia.abstrakcjeinterfejsy.zadanie7;

public class Food {

    String name;
    FoodType type;
    double weight;

    public Food(String name, FoodType type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public FoodType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}
