package functionalprogramming.testrground.optionals.example;

import java.util.Optional;
import java.util.Scanner;

public class OptionalExample {

    public static void main(String[] args) {

        String value = null;

        Optional<String> stringOptional = Optional.of("this is optional");
        Optional<String> optionalThatCanBeEmpty = Optional.ofNullable(value);

        System.out.println(stringOptional.isEmpty());
        System.out.println(optionalThatCanBeEmpty.isEmpty());

        System.out.println("-----------------------");

        stringOptional.ifPresent(System.out::println); //uzycie consumera w metodzie ifPresent
        optionalThatCanBeEmpty.ifPresent(System.out::println); //nie wykona sie

        System.out.println("-----------------------");

        try {
            System.out.println(stringOptional.get());
            System.out.println(optionalThatCanBeEmpty.get());
        } catch (Exception e) {
            System.out.println("seems like optional was empty");
        }

        System.out.println("-----------------------");

        System.out.println(stringOptional.orElse("Empty")); //jesli "Empty" byloby metoda to ZAWSZE WYKONA SIE TA METODA NAWET JAK OPTIONAL NIE JEST PUSTY
        System.out.println(optionalThatCanBeEmpty.orElse("Empty")); //jesli null to zwraca inny string

        getInput().ifPresent(System.out::println);

    }

    public static Optional<String> getInput() {
        return Optional.ofNullable(new Scanner(System.in).nextLine().split(" ")[2]);
    }

}
