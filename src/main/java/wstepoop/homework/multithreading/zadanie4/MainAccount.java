package wstepoop.homework.multithreading.zadanie4;

public class MainAccount {

    public static void main(String[] args) {

        Account ac = new Account();
        ac.deposit(300);

        Thread withdrawing = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Withdrawing 100");
                    ac.withdraw(100);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread depositing = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Depositing 50");
                    ac.deposit(50);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        withdrawing.start();
        depositing.start();

    }


}

