package wstepoop.zajecia.threading.test1;

public class ThreadMain {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new HelloWorldRunnable());

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world from anonymous Runnable interface");
                System.out.println(Thread.currentThread().getId() + " id of another thread");
            }
        });

        System.out.println("Hello world from main thread");
        System.out.println(Thread.currentThread().getId() + " id of main thread");
        new HelloWorldThread().start();
        thread1.start();
        thread2.start();

    }
}

class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world from another thread");
        System.out.println(Thread.currentThread().getId() + " id of another thread");
    }
}

class HelloWorldRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from runnable interface");
        System.out.println(Thread.currentThread().getId() + " id of another thread");
    }
}