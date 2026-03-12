package del1;

//nedarver fra MediaItem, implementerer Playable
//
//Felt: host (String)
//Konstruktør: tager title, host, durationSeconds
//play() printer fx: 🎙 Afspiller podcast: "Lex Fridman #400" med Lex Fridman (1:42:17)

public class Podcast extends MediaItem implements Playable {

    String host;

    public Podcast(String title, String host, int durationSeconds){
        this.host = host;
        super(title, durationSeconds);
    }
    public void play(){
        System.out.println("Afspiller podcast: " + getTitle() + " med "+ host+ " " + getDurationSeconds());
    }

}
