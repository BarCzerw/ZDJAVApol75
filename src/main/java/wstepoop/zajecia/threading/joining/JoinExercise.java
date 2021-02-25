package wstepoop.zajecia.threading.joining;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoinExercise {

    public static void main(String[] args) throws InterruptedException {

        final List<Integer> integerList = new ArrayList<>();
        final Thread t1 = new Thread(new SimpleThread(integerList));
        final Thread t2 = new Thread(new SimpleThread(integerList));

        t1.start();
        t2.start();

        long start = System.nanoTime();
        t1.join(2000);
        long mid = System.nanoTime();
        t2.join(2000);
        long end = System.nanoTime();

        System.out.println(mid-start);
        System.out.println(end-mid);

        System.out.println(integerList.size());

    }

}

class SimpleThread implements Runnable {

    private final List<Integer> integerList;

    SimpleThread(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 40_000_000; i++) {
            integerList.add(new Random().nextInt());
        }
    }
}