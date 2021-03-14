package wstepoop.homework.functional;

import java.util.List;

public class Season {

    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    public Season(String seasonName, int seasonNumber, List<Episode> videos) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = videos;
    }
}
