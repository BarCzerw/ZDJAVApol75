package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericVarArgs {

    static Random RANDOM = new Random();

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> allLists = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                tempList.add(RANDOM.nextInt(20));
            }
            allLists.add(tempList);
        }

        for (int i = 0; i < allLists.size(); i++) {
            System.out.println("List " + i + " - " + allLists.get(i).toString());
        }

        System.out.println(mergeLists(allLists.get(0)));
        System.out.println(mergeLists(allLists.get(0),allLists.get(2)));
        System.out.println(mergeLists(allLists.get(0),allLists.get(2),allLists.get(6)));
    }

    public static <T> List<T> mergeLists(ArrayList<T>... lists){
        List<T> resultList = new ArrayList<>();

        for (ArrayList<T> list:
        lists){
            resultList.addAll(list);
        }

        return resultList;
    }

}
