package wstepoop.gitzadania.medieval;

import java.util.LinkedList;
import java.util.List;

public class Town {

    private List<Citizen> citizenList;

    public Town(List<Citizen> citizenList) {
        this.citizenList = citizenList;
    }

    public List<Citizen> whoCanVote() {

        List<Citizen> citizensWhoCanVote = new LinkedList<>();

        for (Citizen citizen : citizenList) {
            if (citizen.canVote()) {
                citizensWhoCanVote.add(citizen);
            }
        }

        return citizensWhoCanVote;
    }

    public int howManyCanVote() {
        return whoCanVote().size();
    }
}
