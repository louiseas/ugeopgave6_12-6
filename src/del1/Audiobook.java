package del1;

// nedarver fra MediaItem, implementerer Playable
//
//Felt: author (String)
//Konstruktør: tager title, author, durationSeconds
//play() printer fx: 📖 Afspiller lydbog: "Dune" af Frank Herbert (21:14:00)

public class Audiobook extends MediaItem implements Playable {

    String author;

    public Audiobook(String title, String author, int durationSeconds){
        this.author = author;
        super(title, durationSeconds);
    }

    public void play(){
        System.out.println("Afspiller lydbog: " + getTitle() + " af "+ author+ " " + getDurationSeconds());
    }
}
