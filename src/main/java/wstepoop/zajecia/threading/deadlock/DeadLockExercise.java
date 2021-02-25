package wstepoop.zajecia.threading.deadlock;

public class DeadLockExercise {

    public static void main(String[] args) throws InterruptedException {
        final String resource1 = "resource 1";
        final String resource2 = "resource 2";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread 1 is blocking resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 is blocking resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Thread 2 is blocking resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2 is blocking resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("End of code");

    }

}
