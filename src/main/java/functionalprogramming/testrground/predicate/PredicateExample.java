package functionalprogramming.testrground.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = value -> value % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate();

        Predicate<Integer> isPrime = value -> {
            for (int i = value / 2; i > 1; i--) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        };


        valueTester(isEven,156);
        valueTester(isOdd,156);
        valueTester(isPrime,156);

    }

    public static void valueTester(Predicate<Integer> predicate, int valueToCheck) {
        System.out.println(valueToCheck + " - " + predicate.test(valueToCheck));
    }

}
