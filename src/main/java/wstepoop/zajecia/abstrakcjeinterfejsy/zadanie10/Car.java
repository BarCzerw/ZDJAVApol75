package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie10;

public class Car {

    protected String manufacturer;
    protected String model;
    protected String color;

    public Car(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public void changeColor(String color) {
        if (!color.equals(this.color)) {
            this.color = color;
            System.out.println("Car repainted to " + color);
        } else {
            System.out.println("Car already painted in " + color);
        }
    }

    @Override
    public String toString() {
        return color + " " + manufacturer + " " + model;
    }
}
