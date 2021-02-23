package wstepoop.homework.interfaces.zadanie3;

public class MainCarTypes {

    public static void main(String[] args) {

        Car c1 = new Car("BMW i8",CarType.LUXURY);
        Car c2 = new Car("foX",CarType.ECONOMY);
        Car c3 = new Car("GTR",CarType.SPORT);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
