package wstepoop.homework.enums.zadanie3;

public class TemperatureMain {

    public static void main(String[] args) {

        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.CELSIUS,TemperatureUnit.KELVIN,21));
        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.CELSIUS,TemperatureUnit.FAHRENHEIT,21));

        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.KELVIN,TemperatureUnit.CELSIUS,306));
        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.KELVIN,TemperatureUnit.FAHRENHEIT,306));

        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.FAHRENHEIT,TemperatureUnit.CELSIUS,96));
        System.out.println(TemperatureConvert.convertTemperature(TemperatureUnit.FAHRENHEIT,TemperatureUnit.KELVIN,96));

    }

}
