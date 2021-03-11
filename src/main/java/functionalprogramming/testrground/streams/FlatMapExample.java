package functionalprogramming.testrground.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> pinkFloyd = Arrays.asList("Gilmour", "Waters", "Wright", "Mason", "Barret");
        List<String> ledZeppelin = Arrays.asList("Page", "Plant", "Jones", "Bonham");

        List<List<String>> bands = List.of(pinkFloyd, ledZeppelin);

        List<String> members = bands.stream()
                .flatMap(x -> x.stream()) //splaszczenie do pojedynczego streamu
                .collect(Collectors.toList());

        System.out.println(members);

        secondMain();


    }

    public static void secondMain() {
        Statistics statisticsA = new Statistics(2.0, List.of(1, 2, 3));
        Statistics statisticsB = new Statistics(2.5, List.of(2, 2, 3, 3));

        System.out.println(Stream.of(statisticsA, statisticsB)
                .flatMap(statistics -> statistics.getValues().stream())
                .distinct()
                .collect(Collectors.toList()));



    }

    @AllArgsConstructor
    @Getter
    static class Statistics {
        private final double average;
        private final List<Integer> values;
    }

}
