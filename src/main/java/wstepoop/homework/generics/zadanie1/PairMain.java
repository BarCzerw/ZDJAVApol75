package wstepoop.homework.generics.zadanie1;

public class PairMain {

    public static void main(String[] args) {

        Pair<Integer> integerPair = new Pair<>(-5,9);

        System.out.println(integerPair);

        System.out.println(integerPair.getFirst());
        System.out.println(integerPair.getSecond());

        integerPair.setFirst(6);
        integerPair.setSecond(-48);

        System.out.println(integerPair);

    }

}
