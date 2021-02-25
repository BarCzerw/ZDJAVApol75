package wstepoop.zajecia.threading.test2;

public class LoopThreads {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i >= 0; i--) {
                    System.out.println(i);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
