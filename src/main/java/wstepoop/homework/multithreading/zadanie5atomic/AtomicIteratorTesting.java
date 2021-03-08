package wstepoop.homework.multithreading.zadanie5atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIteratorTesting {

    public static void main(String[] args) throws InterruptedException {

        Integer[] intArray = generateArray(6000);

        AtomicIterator<Integer> iter = new AtomicIterator<>(intArray);
        AtomicInteger sum = new AtomicInteger(0);

        Thread summing1 = new Thread(new SummingThread(sum,iter));
        Thread summing2 = new Thread(new SummingThread(sum,iter));
//        Thread printing = new Thread(new PrintingThread(iter));

        summing1.start();
        summing2.start();
//        printing.start();

        summing1.join();
        summing2.join();
//        printing.join();

        System.out.println("MT sum = " + sum);
        System.out.println("ST sum = " + singleThreadSum(intArray));
    }

    static class SummingThread implements Runnable {

        private final AtomicInteger sumReference;
        private final AtomicIterator<Integer> iteratorReference;

        public SummingThread(AtomicInteger sumReference, AtomicIterator<Integer> iterator) {
            this.sumReference = sumReference;
            this.iteratorReference = iterator;
        }

        @Override
        public void run() {
            while (iteratorReference.hasNext()) {
                sumReference.addAndGet(iteratorReference.next());
            }
        }
    }

    static class PrintingThread implements Runnable {

        private final AtomicIterator<Integer> iterator;

        PrintingThread(AtomicIterator<Integer> iterator) {
            this.iterator = iterator;
        }

        @Override
        public void run() {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }



    public static Integer[] generateArray(int count) {
        Integer[] result = new Integer[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Random().nextInt(1000);
        }
        return result;
    }

    public static int singleThreadSum(Integer[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

}
