package wstepoop.homework.multithreading.zadanie2;

public class Bridge {

    private int counter;

    public synchronized void driveThrough(Car car) {
            System.out.println(car + " is driving though the bridge");
            counter++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter + " cars crossed the bridge\n------------------------");
    }

}
