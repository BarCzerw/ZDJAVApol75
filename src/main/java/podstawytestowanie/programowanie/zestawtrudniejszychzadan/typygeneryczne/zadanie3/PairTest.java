package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class PairTest {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        List<Pair<Student, Car>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            studentList.add(new Student());
            carList.add(new Car());
            list.add(new Pair<>(studentList.get(i), carList.get(i)));
        }

        list.get(2).setLeft(null);
        list.get(6).setLeft(null);
        list.get(8).setRight(null);
        list.get(9).setRight(null);

        System.out.println("Full pairs");
        findFullPairs(list).forEach(System.out::println);

    }

    private static <T1,T2> List<Pair<T1,T2>> findFullPairs(List<Pair<T1,T2>> list) {
        List<Pair<T1,T2>> resultList = new ArrayList<>();
        for (Pair pair :
                list) {
            if (pair.getLeft() != null && pair.getRight() != null) {
                resultList.add(pair);
            }
        }
        return resultList;
    }
}
