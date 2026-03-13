package composite_pattern;

public class Song implements Icomponent {
    String songName;
    String artist;
    String speed;
    public void play(){

    }
    public String getName(){
        return "name of the song";
    }

    public void setPlaybackSpeed(){

    }
    public String getArtist(){
        return this.artist;
    }
    
}
