package del1;

//Felt: playlist (ArrayList<Playable>)
//Metoder:
//void add(Playable item)
//void playAll() — kalder play() på alle elementer
//int getTotalDuration() — samlet varighed i sekunder
//void printPlaylist() — printer titler og varighed

import java.util.ArrayList;

public class Mediaplayer {

    ArrayList<Playable>playlist = new ArrayList<>();

    public void add(Playable item){
    playlist.add(item);
    }

    public void playAll(){
        for (Playable item : playlist){
            item.play();
        }

    }

    public int getTotalDuration(){
        int total = 0;
        for (Playable item : playlist){
        total+= item.getDurationSeconds();
        }
        return total;
    }

    public void printTotalDuration(){
        int total = getTotalDuration();
        int hours = total/3600;
        int minutes = (total%3600)/60;
        int seconds = total % 60;

        System.out.println("Samlet spilletid: "+ String.format("%d:%02d:%02d", hours, minutes, seconds));
    }

    public void printPlaylist(){
        for (Playable item : playlist){
            System.out.println("Titel: "+ item.getTitle() + " - "+ item.getDurationSeconds());
        }

    }
}
