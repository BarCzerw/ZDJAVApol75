package wstepoop.gitzadania.medieval;

import java.util.LinkedList;
import java.util.List;

public class MedievalApp {

    public static void main(String[] args) {

        List<Citizen> citizens = new LinkedList<>();

        citizens.add(new King("Danzeus II"));

        for (int i = 0; i < 120; i++) {
            citizens.add(new Soldier("Soldier " + (i + 1)));
        }

        for (int i = 0; i < 1230; i++) {
            citizens.add(new Townsman("Townsman " + (i + 1)));
        }

        for (int i = 0; i < 4800; i++) {
            citizens.add(new Peasant("Peasant " + (i + 1)));
        }

        Town danzig = new Town(citizens);

        System.out.println(danzig.howManyCanVote());

        System.out.println(danzig.whoCanVote());

    }
}
