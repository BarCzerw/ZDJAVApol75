package com.sda.zaawansowane.wstepoop.homework.enums.zadanie3;

public enum TemperatureConvert {

    C_F(TemperatureUnit.CELSIUS,TemperatureUnit.FAHRENHEIT, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return 1.8f*tempIn + 32f;
        }
    }),
    C_K(TemperatureUnit.CELSIUS, TemperatureUnit.KELVIN, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return tempIn+273.15f;
        }
    }),
    K_C(TemperatureUnit.KELVIN, TemperatureUnit.CELSIUS, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return tempIn-273.15f;
        }
    }),
    F_C(TemperatureUnit.FAHRENHEIT, TemperatureUnit.CELSIUS, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return ((tempIn-32.0f)/1.8f);
        }
    }),
    F_K(TemperatureUnit.FAHRENHEIT, TemperatureUnit.KELVIN, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn+459.67f)/(5f*9f);
        }
    }),
    K_F(TemperatureUnit.KELVIN, TemperatureUnit.FAHRENHEIT, new IConverter() {
        @Override
        public float convert(float tempIn) {
            return tempIn*(9f/5f)-459.67f;
        }
    });

    private TemperatureUnit unitIn;
    private TemperatureUnit unitOut;
    private IConverter converter;

    TemperatureConvert(TemperatureUnit unitIn, TemperatureUnit unitOut, IConverter converter) {
        this.unitIn = unitIn;
        this.unitOut = unitOut;
        this.converter = converter;
    }

    static float convertTemperature(TemperatureUnit unitIn, TemperatureUnit unitOut, float temperatureValue){
        return 0;
    }
}
