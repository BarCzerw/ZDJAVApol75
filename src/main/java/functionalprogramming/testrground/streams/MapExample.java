package functionalprogramming.testrground.streams;

import java.util.List;

public class MapExample {

    public static void main(String[] args) {

        List.of(1, 5, 9, 4, 8, 2).stream()
                .map(Math::sqrt)
                .forEach(System.out::println);

    }

}
