package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class FamilyTestSimple {

    public static void main(String[] args) {

        List<IFamilyMember> family = new ArrayList<>();

        family.add(new Father());
        family.add(new Mother());
        family.add(new Kid());
        family.add(new Mother());
        family.add(new Mother());
        family.add(new Father());

        System.out.println(findFathers(family).size());

    }

    private static <T extends IFamilyMember> List<Father> findFathers(List<T> familyMembers) {
        List<Father> fatherList = new ArrayList<>();
        for (T familyMember :
                familyMembers) {
            if (familyMember.getClass().getSimpleName().equals("Father")) {
                fatherList.add((Father) familyMember);
            }
        }
        return fatherList;
    }

}
