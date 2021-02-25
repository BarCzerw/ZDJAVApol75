package wstepoop.homework.multithreading.zadanie5;

public class TreeMain<T> {

    public static void main(String[] args) {

        TreeStructure<Integer> ts = new TreeStructure<>();

        ts.add(3);
        ts.add(5);
        ts.add(9);
        ts.add(13);
        ts.add(2);
        ts.add(56);

        System.out.println(ts.get());
        System.out.println(ts.getNext());
        System.out.println(ts.getNext());
        System.out.println(ts.getNext());
        System.out.println(ts.getNext());
        System.out.println(ts.getNext());
        System.out.println(ts.getNext());
        System.out.println(ts.get());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
        System.out.println(ts.getPrevious());
    }

}
