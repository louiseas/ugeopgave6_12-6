package del1;

// nedarver fra MediaItem, implementerer Playable
//
//Felt: artist (String)
//Konstruktør: tager title, artist, durationSeconds
//play() printer fx: ♪ Afspiller: "Comfortably Numb" af Pink Floyd (6:22)

public class Song extends MediaItem implements Playable{

    private String artist;

    public Song(String title, String artist, int durationSeconds){
        super(title, durationSeconds);
        this.artist = artist;

    }

    public void play(){
        int total = getDurationSeconds();
        int hours = total/3600;
        int minutes = (total%3600)/60;
        int seconds = total % 60;
        System.out.println("Afspiller: " + getTitle() + " af "+ artist+ " (" + String.format("%d:%02d:%02d", hours, minutes, seconds)+ ")");
    }


}
