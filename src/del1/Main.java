package del1;

//Opret mindst seks mediaelementer af alle tre typer. Gem dem i en ArrayList<Playable>.
//
//Kald playAll() og print den samlede spilletid.

public class Main {
    public static void main(String [] args) {

        Mediaplayer mediaplayer = new Mediaplayer();

        System.out.println("****** PLAYLIST ******");

        mediaplayer.add(new Song("Dont matter", "Akon", 3000));
        mediaplayer.add(new Song("Locked up", "Akon", 2500));
        mediaplayer.add(new Podcast("Mørkeland", "Louise", 5000));
        mediaplayer.add(new Audiobook("Java", "Signe og Tess", 13000));
        mediaplayer.add(new Audiobook("Python", "Unknown", 6000));
        mediaplayer.add(new Podcast("Monopolet", "Sara", 17000));

        mediaplayer.playAll();

        mediaplayer.printTotalDuration();
    }
}
