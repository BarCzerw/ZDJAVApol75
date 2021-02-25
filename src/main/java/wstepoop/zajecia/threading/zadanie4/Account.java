package wstepoop.zajecia.threading.zadanie4;

public class Account {

    private double balance;

    synchronized void deposit(double amount) {
        balance+=amount;
        System.out.println("Current balance " + getBalance());
        notify();
    }

    synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println("Not enough balance! Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance-=amount;
        System.out.println("Withdraw complete");
        System.out.println("Current balance " + getBalance());
    }

    synchronized double getBalance() {
        return balance;
    }
}
