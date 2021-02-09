package com.sda.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie1;

public class GenericPrinter {

    public static void main(String[] args) {

        String s1 = "String object";
        String s2 = "Second string";
        String s3 = "Third string";

        TestObject tb1 = new TestObject();
        TestObject tb2 = new TestObject("Anomally",1337);

        print(s1);
        print(s1,s2,s3);

        print(tb1);
        print(tb1,tb2);

    }

    public static <T> void print(T ...elements){
        for (T element :
                elements) {
            System.out.println(element.toString());
        }
    }

}
