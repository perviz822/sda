package composite_pattern;

import java.util.ArrayList;

public class Playlist  implements Icomponent{
    String playListName ;
    ArrayList<Icomponent> playlist = new ArrayList<Icomponent>();
    public void play(){

    };
    public void setPlaybackSpeed(){

    }

    public String getName(){
        return "Name of the playlist";

    }

    public void  add (Icomponent component){
        this.playlist.add(component);
    }

    public  void remove(Icomponent component){
        this.playlist.remove(component);
    }
    
}
