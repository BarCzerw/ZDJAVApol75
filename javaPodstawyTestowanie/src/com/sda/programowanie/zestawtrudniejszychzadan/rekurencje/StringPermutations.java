package com.sda.programowanie.zestawtrudniejszychzadan.rekurencje;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

    public static void main(String[] args) {

        System.out.println(permutations("1234").toString());

    }

    public static Set<String> permutations(String string) {

        Set<String> result = new HashSet<>();

        if (string.length()==0){
            return result;
        }else if(string.length()==1){
            result.add(string);
            return result;
        }else {
            for (int i = 0; i < string.length(); i++) {
                char current = string.charAt(i);
                Set<String> subPermutations = permutations(eraseCharAt(string,i));
                for (String sub :
                        subPermutations) {
                    result.add(current+sub);
                }
            }
        }
        return result;
    }


    private static String eraseCharAt(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1);
    }

}
