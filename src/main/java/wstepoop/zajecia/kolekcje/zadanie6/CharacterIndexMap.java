package wstepoop.zajecia.kolekcje.zadanie6;

import java.util.*;

public class CharacterIndexMap {

    private static void printMap(Map<Character, Set<Integer>> characterIndexMap) {
        System.out.println(characterIndexMap);
    }

    private static void addCharacterToMap(Map<Character, Set<Integer>> map, Character c, int index) {
        if (map.containsKey(c)) {
            map.get(c).add(index);
        } else {
            map.put(c, new LinkedHashSet<>(List.of(index)));
        }
    }

    private static Map<Character, Set<Integer>> getCharacterIndexMap(String s) {
        Map<Character, Set<Integer>> characterIndexMap = new TreeMap<>();
        s=s.replaceAll("\\s","");
        for (int i = 0; i < s.length(); i++) {
            addCharacterToMap(characterIndexMap, s.charAt(i), i);
        }
        return characterIndexMap;
    }

    public static void main(String[] args) {

        printMap(getCharacterIndexMap(new Scanner(System.in).nextLine()));

    }

}
