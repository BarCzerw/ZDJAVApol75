package wstepoop.zajecia.kolekcje.zadanie4;

import java.util.*;

public class MainMaps {

    public static void main(String[] args) {

        Map<String,Integer> stringIntegerMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        stringIntegerMap.put("seven",7);
        stringIntegerMap.put("eleven",11);
        stringIntegerMap.put("three",3);
        stringIntegerMap.put("three",3);
        stringIntegerMap.put("oneone",11);

        System.out.println(stringIntegerMap);

        for (String s : stringIntegerMap.keySet()) {
            System.out.println(stringIntegerMap.get(s));
        }

    }

}
