package podstawytestowanie.programowanie.zestawzadan.zadanie12;

import podstawytestowanie.programowanie.zestawzadan.Input;

public class SpaceEncounter {

    public static void main(String[] args) {

        //wczytaj string od uzytkownika
        String s = Input.readString("Input string: ");
        //stworz nowy string zamieniajac wszystkie znaki oprocz spacji na ""
        String n = s.replaceAll("[^\\s]+", "");
        //wypisz procent castujac na float
        System.out.println((float) 100 * n.length() / s.length());
    }
}
