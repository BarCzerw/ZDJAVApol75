package podstawytestowanie.programowanie.zestawzadan.zadanie6;

import podstawytestowanie.programowanie.zestawzadan.Input;

public class HarmonicSum {

    public static void main(String[] args) {
        int count = Input.readInteger("Number: ");
        System.out.println(harmonicSum(count));
    }

    private static double harmonicSum(int count) {
        double sum = 1;
        for (int i = 2; i <= count; i++) {
            sum += ((double)1 / i);
        }
        return sum;
    }
}
