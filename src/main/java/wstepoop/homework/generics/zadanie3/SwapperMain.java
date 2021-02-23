package wstepoop.homework.generics.zadanie3;

import java.util.Arrays;

public class SwapperMain {

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(integers));
        swap(integers,99,101);
        System.out.println(Arrays.toString(integers));
        swap(integers,2,6);
        System.out.println(Arrays.toString(integers));

    }

    public static <T> void swap(T[] array, int indexFirst, int indexSecond) {
        if (indexFirst != indexSecond && indexFirst < array.length && indexSecond < array.length) {
            T temp = array[indexFirst];
            array[indexFirst] = array[indexSecond];
            array[indexSecond] = temp;
        }
    }
}
