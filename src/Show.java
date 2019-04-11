import java.util.ArrayList;

public class Show {
    String name;
    ArrayList<Season> seasons = new ArrayList<>();


    public Show(String name){
     this.name = name;

    }

    public addSeason(Season season){
    this.seasons.add(season);
    }
}
