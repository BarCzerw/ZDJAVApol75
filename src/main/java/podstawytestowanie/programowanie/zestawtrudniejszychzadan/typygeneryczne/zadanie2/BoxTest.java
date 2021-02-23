package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie2;

import java.util.Scanner;

public class BoxTest {

    public static void main(String[] args) {
        String s = "Alfa";
        Integer i = 1337;
        Scanner sc = new Scanner(System.in);

        Box<Scanner> scannerBox = new Box<>();
        System.out.println(scannerBox.isEmpty());
        scannerBox.setElement(sc);
        System.out.println(scannerBox.getElement());

        Box<String> stringBox = new Box<>();
        System.out.println(stringBox.isEmpty());
        stringBox.setElement(s);
        System.out.println(stringBox.getElement());


        Box<Integer> integerBox = new Box<>();
        System.out.println(integerBox.isEmpty());
        integerBox.setElement(i);
        System.out.println(integerBox.getElement());
    }
}
