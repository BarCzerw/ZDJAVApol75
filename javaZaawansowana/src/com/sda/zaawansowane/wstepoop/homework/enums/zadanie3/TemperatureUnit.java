package com.sda.zaawansowane.wstepoop.homework.enums.zadanie3;

public enum TemperatureUnit {

    CELSIUS("C"),
    FAHRENHEIT("F"),
    KELVIN("K");

    private String symbol;

    TemperatureUnit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
