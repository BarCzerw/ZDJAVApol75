package wstepoop.zajecia.threading.zadanie1;

public class EvenThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEven(1000, 2000);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEven(14300, 17800);
            }
        });

        t1.start();
        t2.start();

    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

    private static void printEven(int rangeStart, int rangeEnd) {
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }

}
