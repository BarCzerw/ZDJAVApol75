package podstawytestowanie.programowanie.zestawtrudniejszychzadan.rekurencje;

public class Fibonacci {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciRecurrence(i));
        }

    }

    public static long fibonacciRecurrence(int n) {
        if (n > 2) {
            return fibonacciRecurrence(n - 1) + fibonacciRecurrence(n - 2);
        } else {
            return n;
        }
    }

}
