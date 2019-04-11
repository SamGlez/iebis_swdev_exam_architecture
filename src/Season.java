import java.util.ArrayList;

public class Season {
    int num;
    ArrayList<Episode> episodes = new ArrayList<>();

    public Season(int num){
    this.num = num;
    }

    public addFullSeason(ArrayList <Episode> episodes){
        this.episodes = episodes;
    }

    public addEpisode(Episode episode){
        this.episodes.add(episode);
    }
}
