package com.sda.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FamilyTest {

    public static void main(String[] args) {

        List<IFamilyMember> family = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            family.add(new Father(generateName(), generateAge(true)));
            family.add(new Mother(generateName(), generateAge(true)));
            family.add(new Kid(generateName(), generateAge(false)));
        }

        System.out.println(findFathers(family).stream().count());

    }

    private static String generateName() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 5 + rand.nextInt(8);
        for (int i = 0; i < length; i++) {
            sb.append(generateChar());
        }
        return sb.toString();
    }

    private static char generateChar() {
        Random rand = new Random();
        int lowBound = 'a';
        int highBound = 'z';
        return (char) (lowBound + rand.nextInt(highBound - lowBound + 1));
    }

    private static int generateAge(boolean isHigh) {
        Random rand = new Random();
        return isHigh ? 25 + rand.nextInt(60) : 3 + rand.nextInt(16);
    }

    private static <T extends IFamilyMember> List<Father> findFathers(List<T> familyMembers) {
        List<T> fatherList = new ArrayList<>();
        for (T familyMember :
                familyMembers) {
            if (familyMember.getClass().getName().equals("Father")) {
                fatherList.add(familyMember);
            }
        }
        return (List<Father>) fatherList;
    }
}
