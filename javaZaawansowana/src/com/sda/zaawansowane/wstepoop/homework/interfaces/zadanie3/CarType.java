package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie3;

public enum CarType {

    ECONOMY(EngineType.DIESEL),
    SPORT(EngineType.PETROL),
    LUXURY(EngineType.ELECTRIC);

    private EngineType engineType;

    CarType(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
