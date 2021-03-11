package functionalprogramming.testrground.streams;

import java.util.Arrays;

public class FilterExample {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array)
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);

    }

}
