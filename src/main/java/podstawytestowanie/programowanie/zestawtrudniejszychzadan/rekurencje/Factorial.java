package podstawytestowanie.programowanie.zestawtrudniejszychzadan.rekurencje;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("---Factorial test---");
        for (int i = 0; i < 10; i++) {
            System.out.println("!" + i + "=" + factorial(i));
        }
    }

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
