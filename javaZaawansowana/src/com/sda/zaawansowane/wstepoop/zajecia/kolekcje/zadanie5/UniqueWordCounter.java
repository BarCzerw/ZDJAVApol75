package com.sda.zaawansowane.wstepoop.zajecia.kolekcje.zadanie5;

import java.util.*;

public class UniqueWordCounter {

    public static Map<String, Integer> getWordsCountMapper() {

        String[] wordFromString = convertStringToWordsArray();
        Map<String, Integer> wordMapper = new TreeMap<>();

        for (String s : wordFromString) {
            addWordToMap(wordMapper, s);
        }

        return wordMapper;
    }

    public static Map<String, Integer> sortMapByValue(Map<String, Integer> mapToSort) {

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        Set<Map.Entry<String,Integer>> set = mapToSort.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -Integer.compare(o1.getValue(),o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    private static void addWordToMap(Map<String, Integer> wordMapper, String s) {
        if (wordMapper.containsKey(s)) {
            wordMapper.put(s, wordMapper.get(s) + 1);
        } else {
            wordMapper.put(s, 1);
        }
    }

    private static String[] convertStringToWordsArray() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split("\\s+");
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue() + " occurrences");
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> wordsCountMapper = getWordsCountMapper();
        printMap(wordsCountMapper);
        System.out.println("---SORTED---");
        printMap(sortMapByValue(wordsCountMapper));

    }

}
