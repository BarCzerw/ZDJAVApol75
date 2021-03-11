package functionalprogramming.testrground.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Arrays.asList(1, 2, 3).stream();
        Stream<String> stringStream = Set.of("cos","innego").stream();
        Stream<Map.Entry<String, Integer>> mapStream = Map.of("a", 25, "b", 37, "c", 58).entrySet().stream();
        Stream<Double> doubleStream = Stream.of(5.76, 1.923, 0.000543);

        Stream<Integer> integerStream1 = Stream.generate(() -> new Random().nextInt());

        integerStream1
                .limit(100)
                .filter(e -> e%2==0)
                .forEach(System.out::println);

    }

}
