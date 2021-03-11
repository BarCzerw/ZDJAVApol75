package functionalprogramming.testrground.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = s -> {
            s = s.trim();
            System.out.println(s);
        };

        trimValue("                       t          ext                ", stringConsumer);

    }

    public static void trimValue(String text, Consumer<String> trimAction) {
        trimAction.accept(text);
    }

}
