package wstepoop.gitzadania.medieval;

public class King extends Citizen {

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
