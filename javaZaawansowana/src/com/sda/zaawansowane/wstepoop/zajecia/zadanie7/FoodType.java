package com.sda.zaawansowane.wstepoop.zajecia.zadanie7;

public enum FoodType {

    MEAT,
    FRUIT,
    VEGETABLE,
    DAIRY;

    static public FoodType getTypeByNumber(int i) {
        return FoodType.values()[i];
    }
}
