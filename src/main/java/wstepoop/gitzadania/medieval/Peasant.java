package wstepoop.gitzadania.medieval;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
