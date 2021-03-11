package podstawytestowanie.programowanie.zestawtrudniejszychzadan.rekurencje;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        System.out.println("---SumArray test---");
        int[] array1 = new int[]{1, 5, 7, 9, 13, 2, 3, -13};
        int[] array2 = new int[]{55};
        int[] array3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(sumRecursive(array1) + " should be " + 27);
        System.out.println(sumRecursive(array2) + " should be " + 55);
        System.out.println(sumRecursive(array3) + " should be " + 9);
        System.out.println("--SumArrayReversed--");
        System.out.println(sumRecursiveReversed(array1) + " should be " + 27);
        System.out.println(sumRecursiveReversed(array2) + " should be " + 55);
        System.out.println(sumRecursiveReversed(array3) + " should be " + 9);
    }

    public static long sumRecursive(int[] numbers) {
        if (numbers.length > 1) {
            return numbers[0] + sumRecursive(Arrays.copyOfRange(numbers, 1, numbers.length));
        } else {
            return numbers[0];
        }
    }

    public static long sumRecursiveReversed(int[] numbers) {
        if (numbers.length > 1) {
            return numbers[numbers.length-1] + sumRecursive(Arrays.copyOfRange(numbers, 0, numbers.length-1));
        } else {
            return numbers[0];
        }
    }
}
