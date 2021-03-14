package wstepoop.homework.functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VideosMain {

    public static void main(String[] args) {
        List<Season> seasons = initializeSeasons();


        List<Episode> allEpisodes = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());

        List<Video> allVideos = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        List<String> allSeasonNames = seasons.stream()
                .map(season -> season.seasonName)
                .collect(Collectors.toList());

        List<Integer> allSeasonsNumber = seasons.stream()
                .map(season -> season.seasonNumber)
                .collect(Collectors.toList());

        List<String> allEpisodesName = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeName)
                .collect(Collectors.toList());

        List<Integer> allEpisodesNumber = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeNumber)
                .collect(Collectors.toList());

        List<String> allVideosName = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .map(video -> video.title)
                .collect(Collectors.toList());

        Map<String, String> urlWithEachVideo = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toMap((video -> video.title), (video -> video.url)));

        List<Video> videosFromEvenSeasonNumbers = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        List<Video> videosFromEvenSeasonNumbersAndEvenEpisodeNumbers = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList());

        List<Video> clipsFromOddSeasonNumbersAndEvenEpisodeNumbers = seasons.stream()
                .filter(season -> season.seasonNumber % 2 != 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType == VideoType.CLIP)
                .collect(Collectors.toList());

        List<Video> previewsFromOddSeasonNumbersAndEvenEpisodeNumbers = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 != 0)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());

        System.out.println("All episodes " + allEpisodes);
        System.out.println("All videos " + allVideos);
        System.out.println("All season names " + allSeasonNames);
        System.out.println("All season numbers " + allSeasonsNumber);
        System.out.println("All episodes names " + allEpisodesName);
        System.out.println("All episodes numbers " + allEpisodesNumber);
        System.out.println("All videos names " + allVideosName);
        System.out.println("All url for videos " + urlWithEachVideo);
        System.out.println("Videos of even seasons " + videosFromEvenSeasonNumbers);
        System.out.println("Videos of even seasons and even episodes " + videosFromEvenSeasonNumbersAndEvenEpisodeNumbers);
        System.out.println("Clips of even episodes and odd seasons " + clipsFromOddSeasonNumbersAndEvenEpisodeNumbers);
        System.out.println("Previews of even seasons and odd episodes " + previewsFromOddSeasonNumbersAndEvenEpisodeNumbers);




    }

    public static List<Season> initializeSeasons() {

        Video v1 = new Video("Pilot 01", "plt01.html", VideoType.PREVIEW);
        Video v2 = new Video("Pilot 02", "plt02.html", VideoType.PREVIEW);
        Video v3 = new Video("Episode 01", "eps01.html", VideoType.EPISODE);
        Video v4 = new Video("Clip 01", "clp01.html", VideoType.CLIP);
        Video v5 = new Video("Episode 02", "eps02.html", VideoType.EPISODE);
        Video v6 = new Video("Clip 02", "clp02.html", VideoType.CLIP);
        Video v7 = new Video("Clip 03", "clp03.html", VideoType.CLIP);
        Video v8 = new Video("Episode 03", "eps03.html", VideoType.EPISODE);

        Episode e1 = new Episode("Intro", 1, List.of(v1));
        Episode e2 = new Episode("Action", 2, List.of(v2, v3, v4));
        Episode e3 = new Episode("Ending", 3, List.of(v5, v6));
        Episode e4 = new Episode("Finish", 4, List.of(v7, v8));

        Season s1 = new Season("Entertainment", 1, List.of(e1, e2));
        Season s2 = new Season("Culmination", 2, List.of(e3,e4));

        return List.of(s1, s2);


    }

}
