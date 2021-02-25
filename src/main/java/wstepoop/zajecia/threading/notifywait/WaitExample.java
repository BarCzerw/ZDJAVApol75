package wstepoop.zajecia.threading.notifywait;

import java.util.LinkedList;
import java.util.Queue;

public class WaitExample {

    public static void main(String[] args) {

        final Customer customer = new Customer();
        final Thread withdrawT = new Thread(new WithdrawingThread(customer));
        final Thread depositT = new Thread(new DepositingThread(customer));

        withdrawT.start();
        depositT.start();

    }

}

class WithdrawingThread implements Runnable {

    private final Customer customer;

    public WithdrawingThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        customer.withdraw(100);
    }
}

class DepositingThread implements Runnable {

    private final Customer customer;

    public DepositingThread(Customer customer) {
        this.customer = customer;
    }


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            customer.deposit(20);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer {
    private int balance;

    public Customer() {
        balance = 0;
    }

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " PLN");
        while (balance < amount) {
            System.out.println("Account is empty! Waiting for income...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdraw complete!");
    }

    synchronized void deposit(int amount) {
        System.out.println("Depositing " + amount + " PLN");
        balance += amount;
        System.out.println("Deposit complete!");
        notify();
    }
}