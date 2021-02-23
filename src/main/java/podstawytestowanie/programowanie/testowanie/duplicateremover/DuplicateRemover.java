package podstawytestowanie.programowanie.testowanie.duplicateremover;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {

    public static String[] removeDuplicates(String[] stringArray) {

        List<String> resultList = new ArrayList<>();

        for (String s :
                stringArray) {
            if (!resultList.contains(s)) {
                resultList.add(s);
            }
        }

        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

}
