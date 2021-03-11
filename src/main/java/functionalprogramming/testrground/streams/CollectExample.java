package functionalprogramming.testrground.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {

        System.out.println(List.of(1, 2, 3, 4, 5).stream()
                .collect(Collectors.toMap(
                        (value -> value + 2),
                        (String::valueOf)
                )));


    }

}
