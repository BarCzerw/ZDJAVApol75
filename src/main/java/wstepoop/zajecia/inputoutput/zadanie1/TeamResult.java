package wstepoop.zajecia.inputoutput.zadanie1;

public class TeamResult {

    private final String name;
    private final int goals;
    private final int penalties;

    public TeamResult(String name, int goals, int penalties) {
        this.name = name;
        this.goals = goals;
        this.penalties = penalties;
    }

    public TeamResult(String name, int goals) {
        this(name, goals, -1);
    }

    public String asWinner() {
        StringBuilder sb = new StringBuilder(name + " <" + goals + ">");
        if (penalties != -1) {
            sb.append("(").append(penalties).append(")");
        }
        return sb.toString();
    }

    public String asLoser() {
        StringBuilder sb = new StringBuilder();
        if (penalties != -1) {
            sb.append("(").append(penalties).append(")");
        }
        sb.append("<").append(goals).append("> ").append(name);
        return sb.toString();
    }

    public int getGoals() {
        return goals;
    }

    public int getPenalties() {
        return penalties;
    }
}
