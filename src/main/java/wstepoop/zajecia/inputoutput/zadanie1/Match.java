package wstepoop.zajecia.inputoutput.zadanie1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Match {

    TeamResult winningTeam, losingTeam;
    boolean isTeamAWinner;

    public Match(TeamResult teamA, TeamResult teamB) {
        this.winningTeam = resolveWinner(teamA, teamB);
        this.losingTeam = isTeamAWinner ? teamB : teamA;
    }

    private TeamResult resolveWinner(TeamResult teamA, TeamResult teamB) {
        if (teamA.getGoals() > teamB.getGoals()) {
            isTeamAWinner = true;
            return teamA;
        } else if (teamA.getGoals() == teamB.getGoals()) {
            if (teamA.getPenalties() > teamB.getPenalties()) {
                isTeamAWinner = true;
                return teamA;
            } else {
                isTeamAWinner = false;
                return teamB;
            }
        } else {
            isTeamAWinner = false;
            return teamB;
        }
    }

    public String getResultAsString() {
        return winningTeam.asWinner() + ":" + losingTeam.asLoser();
    }

    public void writeResultToFile(Path path) throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Files.write(path, (getResultAsString() + "\n").getBytes(), StandardOpenOption.APPEND);
    }

}
