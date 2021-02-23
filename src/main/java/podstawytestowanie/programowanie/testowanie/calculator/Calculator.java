package podstawytestowanie.programowanie.testowanie.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return Double.MIN_VALUE;
        } else {
            return a / b;
        }
    }

    public double arraySum(double[] array) {
        double total = 0;
        for (double num :
                array) {
            total += num;
        }
        return total;
    }

    public boolean isOdd(int num) {
        return num%2!=0;
    }


}
