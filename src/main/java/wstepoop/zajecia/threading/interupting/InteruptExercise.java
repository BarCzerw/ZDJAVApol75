package wstepoop.zajecia.threading.interupting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InteruptExercise {

    public static void main(String[] args) throws InterruptedException {

        final Thread t1 = new Thread(new SleepingThread());

        t1.start();
        t1.interrupt();

        final Thread t2 = new Thread(new AnotherSleepingThread());
        t2.start();
//        Thread.sleep(2000);
        t2.interrupt();
    }

}

class SleepingThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Going to sleep...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");
        }
    }
}

class AnotherSleepingThread implements Runnable {

    @Override
    public void run() {
        final List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            integerList.add(new Random().nextInt());
        }
        //isInterrupted nie resetuje statusu "interupted" - pozostaje juz taki do konca
        //interrupted resetuje i dwa pod rzad zwroca np. true i false
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("I was interrupted!");
            return;
        }
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        System.out.println("sum = " + sum);
    }
}