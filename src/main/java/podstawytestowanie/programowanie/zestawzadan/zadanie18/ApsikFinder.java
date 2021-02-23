package podstawytestowanie.programowanie.zestawzadan.zadanie18;

import podstawytestowanie.programowanie.zestawzadan.Input;

import java.util.regex.Pattern;

public class ApsikFinder {

    static String REGEX = "^[aA]+ psik$";

    public static void main(String[] args) {

        String s = Input.readString("Regex: " + REGEX + "\nInput string to find regex: ");
        System.out.println(containsRegex(s,REGEX) ? "Regex found" : "Regex not found");
    }

    public static boolean containsRegex(String s, String regex){
        Pattern p = Pattern.compile(regex);
        return p.matcher(s).find();
    }
}
