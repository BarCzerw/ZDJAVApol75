package wstepoop.homework.multithreading.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class BridgeMain {

    public static void main(String[] args) {

        Bridge bridge = new Bridge();

        List<Car> carA = new ArrayList<>();
        List<Car> carB = new ArrayList<>();
        /*List<Car> carC = new ArrayList<>();
        List<Car> carD = new ArrayList<>();*/

        for (int i = 0; i < 5; i++) {
            carA.add(CarCreator.create());
            carB.add(CarCreator.create());
            /*carC.add(CarCreator.create());
            carD.add(CarCreator.create());*/
        }

        Thread pointA = new Thread(new Driveable(carA,bridge));
        Thread pointB = new Thread(new Driveable(carB,bridge));
        /*Thread pointC = new Thread(new Driveable(carC,bridge));
        Thread pointD = new Thread(new Driveable(carD,bridge));*/

        pointA.start();
        pointB.start();
        /*pointC.start();
        pointD.start();*/

    }

    static class Driveable implements Runnable {

        private List<Car> cars;
        private Bridge bridge;

        public Driveable(List<Car> cars, Bridge bridge) {
            this.cars = cars;
            this.bridge = bridge;
        }

        @Override
        public void run() {
            for (Car car : cars) {
                bridge.driveThrough(car);
            }
        }
    }
}
