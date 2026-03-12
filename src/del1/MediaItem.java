package del1;

//abstract class MediaItem
//Felter: title (String), durationSeconds (int)
//Konstruktør: tager title og durationSeconds
//Metoder: getters, toString()

abstract class  MediaItem {

    String title;
    int durationSeconds;

    public MediaItem(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle(){
        return title;
    }
    public int getDurationSeconds(){
        return durationSeconds;
    }

    @Override
    public String toString(){
        return null;
    }
}
