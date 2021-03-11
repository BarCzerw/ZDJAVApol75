package functionalprogramming.testrground;

import java.util.function.Consumer;

public class Examples {

    public static void main(String[] args) {

        Thread t1 = new Thread(
                () -> {
                    System.out.println("Hello from runnable");
                    System.out.println("second line of lambda");
                }
        );

        t1.start();

        Consumer<String> consumer = System.out::println;

        consumer.accept("text");

        AppleEater<String> appleEater = apple -> System.out.println("Eating " + apple);
        AppleEater<String> appleEater1 = System.out::println;

        appleEater.consume("sweet apple");
        appleEater1.consume("oh what a sweet apple");


    }

}
