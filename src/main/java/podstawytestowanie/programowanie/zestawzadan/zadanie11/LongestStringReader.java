package podstawytestowanie.programowanie.zestawzadan.zadanie11;

import podstawytestowanie.programowanie.zestawzadan.Input;

public class LongestStringReader {

    public static void main(String[] args) {

        String current;
        String longest="";
        boolean stringRead = false;

        while (!(current = Input.readString("")).equalsIgnoreCase("starczy")) {
            if (current.length() > longest.length()) {
                longest = current;
            }
            stringRead = true;
        }

        System.out.println(stringRead ? longest : "Nie podano żadnego tekstu");
    }
}
